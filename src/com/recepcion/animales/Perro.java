package com.recepcion.animales;

import java.util.ArrayList;
import java.util.Scanner;

public class Perro {
        // Atributos privados (encapsulamiento)
        private String nombre;
        private String raza;
        private int edad;
        private double peso;
        private String HistorialMedico;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double peso, String historialMedico) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        HistorialMedico = historialMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHistorialMedico() {
        return HistorialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        HistorialMedico = historialMedico;
    }

    // Método público para mostrar un saludo
    public void mostrarFichaRegistro() {
        System.out.println("------ FICHA DE REGISTRO ------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Raza: " + getRaza());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("---HISTORIAL MEDICO--" + HistorialMedico);
    }

    // 🐾 Método público que contiene todo el registro
    public static void registrarPerros() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Perro> listaPerros = new ArrayList<>();
        String continuar;

        do {
            Perro perro = new Perro();

            System.out.print("Ingrese el nombre del perro: ");
            perro.setNombre(scanner.nextLine());

            System.out.print("Ingrese la raza: ");
            perro.setRaza(scanner.nextLine());

            System.out.print("Ingrese la edad: ");
            perro.setEdad(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Ingrese el peso (kg): ");
            perro.setPeso(scanner.nextDouble());
            scanner.nextLine();

            System.out.print("Ingrese el historial médico: ");
            perro.setHistorialMedico(scanner.nextLine());

            listaPerros.add(perro);
            System.out.println();

            System.out.print("¿Desea registrar otro perro? (s/n): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        // Mostrar todas las fichas
        System.out.println("\n=== FICHAS REGISTRADAS ===");
        for (Perro p : listaPerros) {
            p.mostrarFichaRegistro();
        }

        scanner.close();
    }
}



