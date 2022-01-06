package main.funciones;

import java.util.Scanner;

public class Funciones {

    String string = new String();

    public String getInformation(String name, String lastName, int age) {
        return "Name: " + name + ", lastname: " + lastName + ", age: " + age;
    }

    public String getInformation(String name, String lastName) {
        return "Name: " + name + ", lastname: " + lastName;
    }

    public String getInformation(String name) {
        return "Name: " + name;
    }

    public int retornaInt() {
        return 0;
    }

    public double retornaDouble() {
        return 0.0;
    }

    public boolean retornaBoolean() {
        return false;
    }

    public double getSumaNumeros(double num1, double num2) {
        var suma = num1 + num2;
        return suma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        var name = in.nextLine();
        System.out.println("Ingresa tu edad");
        var age = Integer.parseInt(in.nextLine());

        System.out.println("name = " + name
                + "\nAge = " + age
                + "\nMayor o no = " + Funciones.validateAge(age));
        System.out.println("Adios");
    }

    /*
     * public => puede ser utilizada por toda la aplicacion
     * private => solo puede ser utilizada por tu clase
     * protected => solo puede ser utlizada por las clases hijas*/

    public static String validateAge(int age) {
        return (age > 17) ? "Es mayor" : "Es menor";
    }

}
