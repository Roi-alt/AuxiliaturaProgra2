class CuentaBancaria{
    private String titular;
    private int nroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, int nroCuenta, double saldo) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    public void retirar(double monto){
        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes");
        } else if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor a cero.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        }
    }
    public void depositar(double monto){
        if (monto <= 0) {
            System.out.println("Error: No se puede depositar numeros negativos o cero.");
        } else {
            saldo += monto;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        }
    }
    public void mostrarDatos(){
        System.out.println("Titular: " + titular + "  Nro Cuenta: " + nroCuenta + "  Saldo: " + saldo);
    }
    
}
public class ejer3 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("dave miller", 1001, 500);
        
        cuenta.mostrarDatos();
        cuenta.depositar(-50);  
        cuenta.retirar(800);    
        cuenta.retirar(200);    
    }
}
