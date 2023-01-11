
package cajeropoo;

public class Cajero {
    private boolean usuarioAutenticado;
    private int numeroDeCuentaActual;
    private final int CONSULTA_DE_SALDO=1;
    private final int RETIRO=2;
    private final int DEPOSITO=3;
    private final int SALIR=4;
    
    public RanuraDeDeposito ranuraDeDeposito;
    public Teclado teclado;
    public Dispensador dispensador;
    public Pantalla pantalla;
    
    public Cajero(){
        ranuraDeDeposito = new RanuraDeDeposito();
        teclado = new Teclado();
        dispensador = new Dispensador();
        pantalla = new Pantalla();
        
    }
    
    public void ejecutar(){
        
    }
    
    private void autenticarUsuario(){
        
    }
    
    private void realizarTransacciones(){
        
    }
    
    private void mostrarMenuPrincipal(){
        pantalla.mostrarMensaje("este es el menu principal");
    }
    
    private Transaccion (int transaccion){
        return ;
    }
    
    
            
    
}
