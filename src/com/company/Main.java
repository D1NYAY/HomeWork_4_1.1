package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String > a = new ArrayList<>();
        ArrayList <String > b = new ArrayList<>();
        ArrayList <String > c = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            a.add(scanner.nextLine());

        }
        System.out.println(a);
        for (int i = 0; i < 5; i++) {
            b.add(scanner.nextLine());
        }
        System.out.println(b);
        Collections.reverse(b);
        System.out.println(b);
        Integer h = 0;
        while (c.size() < a.size() + b.size()){
            c.add(a.get(h));
            c.add(b.get(h));
            h++;
        }
        c.add(a.get(0));
        b.add(a.get(1));
        System.out.println(c);
        Collections.sort(c);
    }


    

}
