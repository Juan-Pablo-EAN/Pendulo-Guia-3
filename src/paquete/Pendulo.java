package paquete;

import java.text.DecimalFormat;

public class Pendulo { //objeto

    private double l, a, o; //atributos

    public Pendulo(int longitud, int aceleracion) { //constructor
        this.l = longitud;
        this.a = aceleracion;
    }

    public void oscilacion() { //este metodo es para hallar la oscilacion
        o = (2*(Math.PI))*(Math.sqrt(a/l));
    }
    
    public void resultado(){
        DecimalFormat dec = new DecimalFormat("#.00");
        oscilacion();
        System.out.println("La oscilación del pendulo es: " + dec.format(o));
    }

}
