class Bus{
    private int capacidadTotal;
    private int pasajeroActuales;

    public Bus(int capasidaTotal, int pasajeroActuales) {
        this.capacidadTotal = capasidaTotal;
        this.pasajeroActuales = pasajeroActuales;
    }
    public void subirPasajeros(int x){
        int disponible =capacidadTotal-pasajeroActuales;
        if(x<=disponible){
            pasajeroActuales+=x;
            System.out.println("subieron "+x+" pasajeros");
        }else{
            System.out.println("no hay asientos disponibles solo hay: "+disponible+" asientos libres");
        }
    }
    public void cobrarPasajes() {
        double total = pasajeroActuales * 1.50;
        System.out.println("Cobro total a los "+pasajeroActuales+" pasajeros: "+total+" Bs");
    }

    public void mostrarAsientosDisponibles() {
        System.out.println("Asientos disponibles: "+(capacidadTotal-pasajeroActuales));
    }
}

public class ejer4 {

    public static void main(String[] args) {
        Bus miBus = new Bus(30, 10);
        miBus.mostrarAsientosDisponibles();
        miBus.subirPasajeros(12);
        miBus.mostrarAsientosDisponibles();
        miBus.cobrarPasajes();
    }
}

