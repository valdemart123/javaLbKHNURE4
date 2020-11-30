package com.valentyn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя щенка");
        String name = sc.nextLine();
        Puppy puppy = new Puppy(name);
        puppy.getName();
        puppy.bite();
        puppy.run();
        puppy.jump();
        puppy.voice();
        System.out.println("HashCode метод: " +puppy.hashCode());
        System.out.println("ToString метод: " + puppy.toString());
        System.out.println("Equals метод: " + puppy.equals(puppy));
    }
}
