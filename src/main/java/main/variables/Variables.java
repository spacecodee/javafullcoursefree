package main.variables;

public class Variables {

    // Tipos de datos Primitivos
    int num = 0;
    double num2 = 0.0;
    float num3 = 0.0F;
    byte byt = 0;
    long lon = 0;
    boolean bool = true;
    char charr = 'A';

    // No primitivos
    String cadena = "Hola, soy una cadena";

    public void method() {
        var parsear = Integer.parseInt("Juan oerez");
        var cambiarVariable = Math.floorDiv(1555, 5200);
    }

    public static long generateCardNumber() {
        return (long) Math.floor(Math.random() * 999999999999L) + 10000000000L;
    }
}
