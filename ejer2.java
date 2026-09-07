class Computadora{
    private String marca;
    private String procesador;
    private int ram;
    private int almacenamiento;

    public Computadora(String marca, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getMarca() {
        return marca;
    }
    
    public void mostrarDatos(){
        System.out.println("Marca: "+marca+"  RAM: "+ram+"GB  Almacenamiento: "+almacenamiento+"GB , Procesador: "+procesador);
    }
}
public class ejer2 {

    public static void main(String[] args) {
        int x = 16;
        
        Computadora compu1=new Computadora("Dell","intel corei7",16,1024);
        Computadora compu2=new Computadora("HP","AMD Rizen 5",8,512);
        
        if(compu1.getRam()==x){
            System.out.println(compu1.getMarca()+" tiene "+x+"GB de RAM.");
        }
        if(compu2.getRam()==x){
            System.out.println(compu2.getMarca()+" tiene "+x+"GB de RAM.");
        }
        System.out.println("la compu con mas almacenamiento es: ");
        if(compu1.getAlmacenamiento()>compu2.getAlmacenamiento()){
            compu1.mostrarDatos();
        }else if(compu1.getAlmacenamiento()<compu2.getAlmacenamiento()){
            compu2.mostrarDatos();
        }else{
            System.out.println("las 2 tienen el mismo almacenamiento");
        }
    }
}
