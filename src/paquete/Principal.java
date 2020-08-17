package paquete;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String args[]){
        int longitud = 0;
        int aceleracion = 0;
        String longi = "";
        String acel = "";
        
        longi = JOptionPane.showInputDialog("¿Cual es la longitud de la cuerda del pendulo?");
        longitud = Integer.parseInt(longi);
        acel = JOptionPane.showInputDialog("¿Cual es la aceleración del pendulo?");
        aceleracion = Integer.parseInt(acel);
        
        Pendulo metodos = new Pendulo(longitud, aceleracion);
        metodos.resultado();
        
    }
}
