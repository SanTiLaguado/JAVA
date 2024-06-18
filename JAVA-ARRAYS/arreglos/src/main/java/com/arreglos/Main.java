package com.arreglos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Backend Java");

        list.add(0, "Fundamentos");

        System.out.println(list);

        for(String item : list){
            System.out.println("founded " + item);
        }

        String elemento1 = list.get(1);
        System.out.println("Elemento 1: " + elemento1);
        list.set(0, "Programacion Web");
        
        String eliminado = list.remove(1);
        String aeliminar = ("Programming");
        boolean result = list.remove(aeliminar);

        System.out.println("eliminado: " + eliminado);
        System.out.println(aeliminar + " eliminado?: " + result);
        System.out.println(list);
        list.clear();
        System.out.println(list);




    }
}