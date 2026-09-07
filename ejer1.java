
class Auto{
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;

    public Auto(String marca, String modelo, int anio, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }
    
    public void mostrarKilometraje(){
        int metro=this.kilometraje*1000;
        System.out.println("kilometraje: "+this.kilometraje+" km ( "+metro+" metros)");
    }
    
    public void cambioDeColor(String nuevoColor){
        System.out.println("el auto "+this.marca+" "+this.modelo+"su nuevo color es: "+nuevoColor);
    }
    
}
public class ejer1 {

    public static void main(String[] args) {
        Auto auto1=new Auto("Toyota","Corrolla",2020,450);
        Auto auto2=new Auto("Honda","Civic",2022,120);
        auto1.mostrarKilometraje();
        auto1.cambioDeColor("azul");
        auto2.mostrarKilometraje();
        auto2.cambioDeColor("rojo");
    }
}
