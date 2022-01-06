package main;

public class Main {
    // Primero se declaran las variables
    // Segundo se declaran los metodos
    // Instanciar objetos
    // Debes llamar a tus metodos

    // estatic = estatico => no le pertenece al objeto :> le pertenece a la clase

    // Clase => Da estructura a tu programa : solo acepta metodos | variables o todo lo que sea estatico
    // Objecto => Es solo una instancia de la clase

    private static String name = "Juan";
    private static String name1 = "Mateo";

    public static void main(String[] args) {
        Main.name = "Marco";
        String name1 = "Paula";

        System.out.println(Main.returnName(name1));
    }

    private static String returnName(String string) {
        return string;
    }
}
