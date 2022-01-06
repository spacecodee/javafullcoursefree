package main.poo;

public class MainPoo {
    //POO -> Programación Orientada a Objetos

    //TODO: static ->
    private static final Persona persona = new Persona(75221541, "Pedro", "Fernandez", 16, "Peruana");

    public static void main(String[] args) {
        System.out.println("MainPoo.persona = " + MainPoo.persona + "\n");

        if (MainPoo.persona.getEdad() > 17) {
            System.out.println("Tu nombre se a cambiado correctamente\n");
            MainPoo.cambiarNombre();
        } else {
            System.out.println("Lo siento, no puedes cambiar tu nombre aún\n");
        }

        System.out.println("MainPoo.persona = " + MainPoo.persona);
    }

    private static void cambiarNombre() {
        MainPoo.persona.setNombre("Juan");
        MainPoo.persona.setApellidos("Perez");
    }
}
