package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample4();
    }

    public static void sample4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.println("Ievadiet frāzi!");
        String b = sc.nextLine();

        System.out.println("aaaa");
        System.out.println(b);
    }

    public static void sample1(){
        int a = 2;
        String b = "aaa";
        double c = 2.4;
        boolean d = true;

        int[] aa = new int[3];
        int[] bb = {1,2,3};

        List<Integer> cc = new ArrayList<>();
        cc.add(1);
        cc.add(4);
        cc.set(0, 999);

        System.out.println(cc.get(0));
    }

    public static void sample2(){
        System.out.println("Izvade");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi tekstu!");

        String input = sc.nextLine();
        System.out.println(input);

        try{
            int input2 = sc.nextInt();
        }catch(Exception e){
            System.out.println("Ievadiet skaitli!");
        }
    }

    public static void sample3(){
        String a = "aaaa";

        if(a.equals("aaaa")){

        }
    }
}