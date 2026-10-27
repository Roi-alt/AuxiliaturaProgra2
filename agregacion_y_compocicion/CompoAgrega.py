class Pantalla:
    def __init__(self, tipo="amoled", alto=6, ancho=7):
        self.tipo = tipo
        self.alto = alto
        self.ancho = ancho

    def get_ancho(self):
        return self.ancho

    def __str__(self):
        return f"Pantalla{{ tipo= {self.tipo}, alto={self.alto}, ancho= {self.ancho}}}"


class Aplicacion:
    def __init__(self, nombre: str, tamanio: int):
        self.nombre = nombre
        self.tamanio = tamanio

    def get_nombre(self):
        return self.nombre

    def get_tamanio(self):
        return self.tamanio

    def __str__(self):
        return f"Aplicacion{{nombre={self.nombre}, tamanio= {self.tamanio}}}"


class Laptop:
    def __init__(self, modelo: str, cantApp: int, tipo: str, ancho: int, alto: int):
        self.modelo = modelo
        self.cantApp = cantApp
        self.apps = []
        self.pantalla = Pantalla(tipo, alto, ancho)

    def agregar_app(self, app: Aplicacion):
        self.apps.append(app)
        self.cantApp += 1

    def eliminar_app(self):
        self.apps.clear()
        self.cantApp = 0

    def ordenar_apps(self):
        self.apps.sort(key=lambda a: (-a.get_tamanio(), a.get_nombre()))

    def get_cant_app(self):
        return self.cantApp

    def get_modelo(self):
        return self.modelo

    def get_pantalla(self):
        return self.pantalla

    def __str__(self):
        return f"Laptop{{modelo={self.modelo}, cantApp={self.cantApp} ,pantalla={self.pantalla}}}"


def main():
    p = Pantalla()
    
    lap = Laptop("samsung", 3, "icd ips", 13, 7)
    lap1 = Laptop("samsung", 3, "icd ips", 13, 7)
    lap2 = Laptop("samsung", 3, "icd ips", 13, 7)
    lap3 = Laptop("samsung", 3, "icd ips", 13, 7)
    
    vec = [lap, lap1, lap2, lap3]

    # Inciso b)
    may = -1
    for l in vec:
        if l.get_cant_app() > may:
            may = l.get_cant_app()
            
    for l in vec:
        if l.get_cant_app() == may:
            print(l)

    # Inciso c)
    x = input("Ingrese el modelo X: ")
    for laptop in vec:
        if laptop.get_modelo() == x:
            nom = input("Nombre de la app: ")
            tam = int(input("Tamaño de la app: "))
            laptop.agregar_app(Aplicacion(nom, tam))

    # Inciso d)
    ancho = int(input("Ingrese el ancho Y de la pantalla: "))
    for laptop in vec:
        if laptop.get_pantalla().get_ancho() == ancho:
            laptop.eliminar_app()

    # Inciso e)
    may_e = -1
    for l in vec:
        if l.get_cant_app() > may_e:
            may_e = l.get_cant_app()
            
    for l in vec:
        if l.get_cant_app() == may_e:
            print(l)

    # Inciso f)
    for laptop in vec:
        laptop.ordenar_apps()
        
    for l in vec:
        print(l)


if __name__ == "__main__":
    main()