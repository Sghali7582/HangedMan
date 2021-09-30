package com.coralcorp.hangedman;

import java.util.Scanner;

public class Palabras {
    public static String[] Categorias(String cat) {
        int a = 1;
        final Scanner lectura = new Scanner(System.in);
        final String[] categoria = new String[10];
        categoria[0] = "Colores";
        categoria[1] = "Animales";
        categoria[2] = "Muebles de casa";
        categoria[3] = "Prendas de vestir";
        categoria[4] = "Objetos de cocina";
        categoria[5] = "Frutas y verduras";
        categoria[6] = "Medios de transporte";
        categoria[7] = "Pa\u00EDses de Europa";
        categoria[8] = "Pa\u00EDses de Am\u00E9rica";
        categoria[9] = "Pel\u00EDculas de Disney";

        for (int i = 0; i < 10; i++) {
            if (categoria[i].equals(cat)) {
                a = i;
                break;
            }
        }

        return OpcionesGeneradas.seleccion(a);
    }
}

