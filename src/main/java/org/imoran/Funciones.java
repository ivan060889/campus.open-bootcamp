package org.imoran;

public class Funciones {
    public static void main(String[] args) {
        saludo("moran celi");
        int result =suma(4,5);
        System.out.println("result = " + result);
        int pro= promedio(4,5,5);
    }


    static void saludo(String name) {
        System.out.println("mis apellidos " + name);
    }
    static int suma(int number1 , int number2)
    {
        return (number1 + number2);
        
    }
    static int promedio(int number,int number1,int number2)
    {
        return (number+ number1 + number2)/2;
    }
}