class Anuncio{
    private int numero;
    private double precio;
    
    public Anuncio() {
        this.numero = 0;
        this.precio = 0.1;
    }
    
    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }
}

class Artista{
    private String nombre;
    private int ci;
    private int aniosExp;

    public Artista(String nombre, int ci, int aniosExp) {
        this.nombre = nombre;
        this.ci = ci;
        this.aniosExp = aniosExp;
    }

    public int getAniosExp() {
        return this.aniosExp;
    }
}

class Obra{
    protected String titulo;
    protected String material;
    protected Artista artista1;
    protected Artista artista2;
    protected Anuncio anuncio;

    public Obra(String titulo, String material, String nom1, int car1,int anios1, String nom2, int car2, int anios2) {
        this.titulo = titulo;
        this.material = material;
        this.artista1 = new Artista(nom1,car1,anios1);
        this.artista2 = new Artista(nom2,car2,anios2);;
        this.anuncio = null;
    }
    
    public void agregarAnuncio(Anuncio anun){
        this.anuncio = anun;
    }
    
    public Artista getArt1(){
        return this.artista1;
    }
    
}

class Pintura extends Obra{
    private String genero;

    public Pintura(String titulo, String material, String nom1, int car1, int anios1, String nom2, int car2, int anios2, String genero) {
        super(titulo, material, nom1, car1, anios1, nom2, car2, anios2);
        this.genero = genero;
    }
}

public class Tarea4 {
    public static void main(String[] args) {
        Anuncio a1 = new Anuncio();
        Anuncio a2 = new Anuncio(2,2.3);
        
        Pintura p1 = new Pintura("monalisa","oleo","davinci",123,20,"joel",321,1,"intriga");
        Pintura p2 = new Pintura("NocheEstrellada","olea","vangoh",123,40,"miguel",321,4,"nostalgia");
        
        System.out.println(((Integer) p1.getArt1().getAniosExp()).getClass());
        
    }
}