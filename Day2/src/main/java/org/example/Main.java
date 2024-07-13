package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Ievadi 5 skaitlus");
        Scanner sc = new Scanner(System.in);

        List<Integer> Saraksts1 = new ArrayList<>();
        int Skaitlis1 = 0;
        for(int i = 0; i < 5; i++){
            Skaitlis1 = sc.nextInt();
            Saraksts1.add(Skaitlis1);
        }

        System.out.println("Ievadi 5 citus skaitlus!");

        List<Integer> Saraksts2 = new ArrayList<>();
        int Skaitlis2 = 0;
        for(int i = 0; i < 5; i++){
            Skaitlis2 = sc.nextInt();
            Saraksts2.add(Skaitlis2);

        }
        int Lielaka = atrastLielako(Saraksts1, Saraksts2);
        System.out.println(Lielaka);
    }

    public static int dabutSummu(List<Integer> saraksts){
        int result = 0;
        for (int i = 0; i < saraksts.size(); i++) {
            result = result + saraksts.get(i);
        }

        return result;
    }

    public static int atrastLielako(List<Integer> Saraksts1, List<Integer> Saraksts2) {
        int result1 = dabutSummu(Saraksts1);
        int result2 = dabutSummu(Saraksts2);

        if (result1 > result2) {
            return result1;
        } else {
            return result2;
        }
    }
}