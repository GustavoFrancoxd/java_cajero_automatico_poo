
package cajeropoo;

public class Cuenta {
    private int numeroDeCuenta;
    private int pin;
    private double saldoDisponible;
    private double saldoTotal;
    
    public Cuenta(int numeroDeCuenta, int pin, double saldoDisponible, double saldoTotal){
        this.numeroDeCuenta=numeroDeCuenta;
        this.pin=pin;
        this.saldoDisponible=saldoDisponible;
        this.saldoTotal=saldoTotal;
    }
    
    public boolean validarPIN(int numeroPin){
        return numeroPin==pin;
        
    }
    
    public double getSaldoDisponible(){
        return saldoDisponible;
    }
    
    public double getSaldoTotal(){
        return saldoTotal;
    }
    
    public void abonar(double cantidad){
        saldoDisponible+=cantidad;
    }
    
    public void cargar(double cantidad){
        saldoTotal+=cantidad;
    }
    
    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    
}
