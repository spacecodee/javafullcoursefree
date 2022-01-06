package main.prepoo;

import java.util.ArrayList;
import java.util.List;

public class MianPre {

    public static void main(String[] args) {
        // if => else => if else => operador ternario

        /*var num1 = 16;

        if (num1 > 206) {
            System.out.println("Es menor");
        } else if (num1 > 20) {
            System.out.println("Es mayor");
        } else {
            System.out.println("Es is8bfiuwabigbdbvfib");
        }

        var comparation = (num1 > (15 - 5)) ? new ArrayList<>() : new Object();*/

        // Bucles -> while, do while, fori, forEach

        var i = 0;

        // hace y valida al mimso tiempo
        /*while (i > 0) {
            System.out.println("i = " + i);
            i--;
        }

        // primero hace y luego valida
        do {
            // el cuerpo del bucle
            System.out.println("i = " + i);
            i++;
        } while (i < 10);*/

        //
        /*for (int j = 10; j > 1; j--) {
            // ++j; 1 + 1 = 2
            // j++; da la vuelva y luego 1 + 1 = 2
            System.out.println("j = " + j);
        }*/

        int[] ages = {
                18, 19, 20, 21, 22, 23, 24, 25
        };

        String[] cities = {
                "Lima", "Tumbes", "Tacna"
        };

        for (int j = 0; j < ages.length; j++) {
            System.out.println("ages[j] = " + ages[j]);
        }

        System.out.println("\n****************\n");

        for (int age :
                ages) {
            System.out.println("age = " + age);
        }

        System.out.println("\n****************\n");

        for (String city :
                cities) {
            if (city.equalsIgnoreCase("TUMBES")) {
                System.out.println("Esta " + city + " :)");
                continue;
            }
            System.out.println("city = " + city);
        }

        // break, continue
    }
}
