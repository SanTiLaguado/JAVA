package com.clases;

import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> lstStudents = new ArrayList<>();
        Estudiante estudiante;

        try (Scanner sc = new Scanner(System.in)){
            while(JOptionPane.showConfirmDialog(null, "Quiere Agregar un estudiante)", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
                estudiante = new Estudiante();
                System.out.println("Ingrese el nombre: ");
                estudiante.setNombre(sc.nextLine());
                System.out.println("Ingrese el Apellido: ");
                estudiante.setApellido(sc.nextLine());
                System.out.println("Ingrese la Edad: ");
                estudiante.setEdad(sc.nextInt());
                sc.nextLine();
                lstStudents.add(estudiante);
            }
        }

        for(Estudiante item : lstStudents){
            System.out.println(item.getNombre());
        }
    }
}