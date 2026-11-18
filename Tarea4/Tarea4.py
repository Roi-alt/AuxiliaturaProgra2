class Anuncio:
    def __init__(self, num=0, pre=0.1):
        self.__numero = num
        self.__precio = pre

    def getPrecio(self):
        return self.__precio

class Artista:
    def __init__(self, nom, car, anios):
        self.__nombre = nom
        self.__ci = car
        self.__aniosExp = anios;

    def getAnios(self):
        return self.__aniosExp
    
    def getNombre(self):
        return self.__nombre

class Obra:
    def __init__(self, titulo, material, nom1, car1, anios1, nom2, car2, anios2):
        self._titulo = titulo
        self._material = material
        self._artista1 = Artista(nom1,car1,anios1)
        self._artista2 = Artista(nom2,car2,anios2)
        self._anuncio = None

    def agregarAnuncio(self, anun):
        self._anuncio = anun

    def getArt1(self):
        return self._artista1

    def getArt2(self):
        return self._artista2

    def getAnuncio(self):
        return self._anuncio

class Pintura(Obra):
    def __init__(self, titulo, material, nom1, car1, anios1, nom2, car2, anios2,gen):
        super().__init__(titulo, material, nom1, car1, anios1, nom2, car2, anios2)
        self.__genero = gen

class Main():
    a1 = Anuncio()
    a2 = Anuncio(2,2.3)

    p1 = Pintura("monalisa", "oleo", "devinci", 123, 20, "joel", 321,1,"intriga")
    p2 = Pintura("NocheEstrellada", "oleo", "Vangoh", 123, 40, "miguel", 321,4,"nostalgia")
    p2.agregarAnuncio(a1)
    print(type((p1.getArt1()).getAnios()))

    artistas = [p1.getArt1(), p1.getArt2(), p2.getArt1(), p2.getArt2()]
    mayor = artistas[0]
    for a in artistas:
        if a.getAnios() > mayor.getAnios():
            mayor = a 
    print("Artista con mas experiencia: ", mayor.getNombre())

    p1.agregarAnuncio(a2)

    total = (
        (p1.getAnuncio().getPrecio() if p1.getAnuncio() else 0)
        + (p2.getAnuncio().getPrecio() if p2.getAnuncio() else 0)
    )
    print("Monto total de venta: ",total)