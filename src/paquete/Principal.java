package paquete;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
        int longitud = 0;
        int aceleracion = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cual es la longitud de la cuerda del pendulo?");
        longitud = entrada.nextInt();
        System.out.println("¿Cual es la aceleración del pendulo?");
        aceleracion = entrada.nextInt();
        
        Pendulo metodos = new Pendulo(longitud, aceleracion);
        metodos.resultado();
    }
}
