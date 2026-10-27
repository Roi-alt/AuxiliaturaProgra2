import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
class Pantalla{
    private String tipo;
    private int alto;
    private int ancho;

    public Pantalla(String tipo, int alto, int ancho) {
        this.tipo = tipo;
        this.alto = alto;
        this.ancho = ancho;
    }
    public Pantalla() {
        this.tipo = "amoled";
        this.alto = 6;
        this.ancho = 7;
    }

    public int getAncho() {
        return ancho;
    }
    
    @Override
    public String toString(){
        return "Pantalla{ tipo= "+tipo+", alto="+alto+", ancho= "+ancho+"}";
    }
}

class Aplicacion{
    private String nombre;
    private int tamanio;

    public Aplicacion(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }
    
    @Override
    public String toString(){
        return "Aplicacion{nombre="+nombre+", tamanio= "+tamanio+"}";
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getTamanio() {
        return tamanio;
    }
}

class Laptop{
    private String modelo;
    private int cantApp;
    private ArrayList<Aplicacion> apps=new ArrayList<>();
    private Pantalla pantalla = new Pantalla();

    public Laptop(String modelo, int cantApp,String tipo,int ancho,int alto) {
        this.modelo = modelo;
        this.cantApp = cantApp;
        this.pantalla=new Pantalla(tipo,ancho,alto);
    }
    public void agregarApp(Aplicacion app){
        this.apps.add(app);
        this.cantApp++;
    }
    
    public void eliminarApp(){
        this.apps.clear();
        this.cantApp=0;
    }
    
    public void ordenarApps(){
        apps.sort(new Comparator<Aplicacion>() {
            @Override
            public int compare(Aplicacion a1, Aplicacion a2) {
                if (a2.getTamanio() != a1.getTamanio()) {
                    return Integer.compare(a2.getTamanio(), a1.getTamanio()); // Decreciente
                }
                return a1.getNombre().compareTo(a2.getNombre()); // Ascendente por nombre
            }
        });
    }
    
    public int getCantApp() {
        return this.cantApp;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setCantApp(int cantApp) {
        this.cantApp = cantApp;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }
    @Override
    public String toString(){
        return "Laptop{modelo="+modelo+", cantApp="+cantApp+" ,pantalla="+pantalla+"}";
    }
    
}
public class CompoAgrega {
    public static void main(String[] args) {
        
        Pantalla p=new Pantalla();
        
        Laptop lap = new Laptop("samsung",3,"icd ips",13,7);
        Laptop lap1 = new Laptop("samsung",3,"icd ips",13,7);
        Laptop lap2 = new Laptop("samsung",3,"icd ips",13,7);
        Laptop lap3 = new Laptop("samsung",3,"icd ips",13,7);
        ArrayList<Laptop> vec=new ArrayList<>();
        vec.add(lap);
        vec.add(lap1);
        vec.add(lap2);
        vec.add(lap3);
        //inciso b)
        int may=-1;
        for(Laptop l: vec){
            if(l.getCantApp()>may){
                may=l.getCantApp();
            }
        }
        for (Laptop l: vec){
            if(l.getCantApp()==may){
                System.out.println(l);
            }
        }
        //inciso c)
        Scanner te=new Scanner(System.in);
        String x;
        x=te.nextLine();
        for(Laptop laptop: vec){
            if(laptop.getModelo().equals(x)){
                String nom;
                int tam;
                nom=te.nextLine();
                tam=te.nextInt();
                laptop.agregarApp(new Aplicacion(nom,tam));
            }
        }
        //inciso d)
        int ancho=te.nextInt();
        for(Laptop laptop: vec){
            if(laptop.getPantalla().getAncho()==ancho){
                laptop.eliminarApp();
            }
        }
        //inciso e)
        int mayE=-1;
        for(Laptop l: vec){
            if(l.getCantApp()>mayE){
                mayE=l.getCantApp();
            }
        }
        for (Laptop l: vec){
            if(l.getCantApp() == mayE){
                System.out.println(l);
            }
        }
        // inciso f)
        for(Laptop laptop: vec){
            laptop.ordenarApps();
        }
        for(Laptop l: vec){
            System.out.println(l);
        }
    }
}
