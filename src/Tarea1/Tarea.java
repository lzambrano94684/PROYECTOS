package Tarea1;

import java.util.Scanner;

public class Tarea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido alumno de Ing. en Sistemas al año 2022");
        System.out.println("Por favor ingresa tu nombre y apellido");
        String alumno = scanner.nextLine();

        System.out.println("Hola " + alumno+ "\nBienvenido a la Universidad Mariano Galvez");
    }
}