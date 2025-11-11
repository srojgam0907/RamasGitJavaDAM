package edu.alumno.ssh;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Investiga el uso de random y genera por pantalla los números de la lotería primitiva.
        Random random = new Random();
        int numeros=random.nextInt(10000);

        System.out.println("Números de la Lotería Primitiva:");
        System.out.println(numeros);// Genera 5 números principales 

        System.out.println("¡Buena suerte en el sorteo!");

    }
}
