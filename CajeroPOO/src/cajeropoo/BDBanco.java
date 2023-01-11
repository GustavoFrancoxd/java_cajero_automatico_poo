
package cajeropoo;

import java.util.ArrayList;

public class BDBanco {
    public ArrayList <Cuenta> cuentas= new ArrayList<Cuenta>();
    
    
    public BDBanco(){
        
        Cuenta cuenta = new Cuenta(12345, 123, 10000, 20000);//////////////////////////// corregir
        Cuenta cuenta2=new Cuenta(23456, 234, 11000, 2000);
        cuentas.add(cuenta);
        cuentas.add(cuenta2);
    } 
    
    private Cuenta getCuenta(int numeroDeCuenta){
        return;
    }
    
    public boolean autenticarUsuario(int numeroDeCuenta){
        return true;
    }
    
    public double getSaldoDisponible(int numeroDeCuenta){
        return 1.1;
    }
    
    public double getSaldoTotal(){
        return 1.1;
    }
    
    public void abonar(int numeroDeCuenta, double cantidad){
        
    }
    
    public void cargar(int numeroDeCuenta, double cantidad){
        
        
    }
}
