package com.recepcion.animales;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {

        // PRUEBA: Creo una instancia con el constructor completo
        Perro primerPerro = new Perro("Bruno", "Criollo", 5, 20, "Vacunas al día");
        System.out.println(primerPerro.getNombre());
        System.out.println(primerPerro.getRaza());
        primerPerro.mostrarFichaRegistro();
        Perro.registrarPerros();  // 👈 Aquí llamas al método

    }
}
