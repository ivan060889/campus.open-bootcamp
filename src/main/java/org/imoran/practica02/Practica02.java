package org.imoran.practica02;

import java.util.Scanner;

public class Practica02 {
    public static void main(String[] args) {
        double base;
        double porcentaje;
        double total;
        double iva;
        Scanner leer = new Scanner(System.in);
        Caculariva caculariva = new Caculariva();
        System.out.println("Ingrese el valor de la base: ");
        base = leer.nextDouble();
        System.out.println(" Ingresea el porcentaje: ");
        porcentaje= leer.nextDouble();

        iva = Caculariva.Calcular(base, porcentaje);
        total = base + iva;
        System.err.println("*****************************IVAN MORAN CELI *******************");
        System.err.println("Base: " + base);
        System.err.println("IVA: " + iva);
        System.err.println("Total: " + total);





    }
}
