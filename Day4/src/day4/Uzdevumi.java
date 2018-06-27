/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author lelde
 */
public class Uzdevumi {

//    public String text="";
//    
//    public static void Piemeri(){
//        
//          //cikls no 1 līdz 10
//        for (int i=1;i<=10;i++){
//            System.out.println("i= "+i);
//        }
//        //cikls no 5 līdz 1
//        int N=5;
//        while(true){
//            if(N==0){
//                break;
//            }
//            System.out.println("N= "+N);
//        }
//    }
    private static Scanner input = new Scanner(System.in);

    public static void Uzd1() {

        System.out.println("Ievadi skaitli N: ");
        int N = input.nextInt();

        int summa = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
            summa += i;
        }
        System.out.println("Summa: " + summa);
    }

    public static void Uzd2() {

        System.out.println("Ievadi skaitli N: ");
        int N = input.nextInt();

        int summ = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Ievadi skaitli " + i + ": ");
            int N1 = input.nextInt();
            summ += N1;
        }
        int average = (summ / N);
        System.out.println("Summa: " + summ + " vidējā vērtība: " + average);
    }

    public static void Uzd3() {

        System.out.println("Ievadi skaitli N: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Ievadi skaitli " + i + ": ");
            int N1 = input.nextInt();
            int sqr = (N1 * N1 * N1);
            System.out.println("Skaitlis: " + N1 + " skaitļa kubs: " + sqr);
        }
    }

    public static void Uzd4() {

        System.out.println("Ievadi skaitli N: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int zv = 1; zv <= 2 * i - 1; zv++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void Uzd5() {

        System.out.println("Ievadi skaitli N: ");
        int N = input.nextInt();

        for (int a = 0; a < N; a++) {

            if (a % 2 == 0) {
                for (int i = 1; i <= N; i++) {
                    System.out.print(i);
                }
                System.out.println();
            } else {
                for (int j = N; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

    }

    public static void Uzd6() {

        System.out.println("Ievadi skaitli N: ");
        int N = input.nextInt();
        int rev = 0;
        while (N != 0) {
            rev = (rev * 10 + N % 10);
            N /= 10;
        }
        System.out.println(rev);
    }

    public static void Uzd7() {

        System.out.println("Ievadi skaitli N: ");
        int N = input.nextInt();

        int count =1;
        for (int i = 1; i <= N; i++) {
            
            for (int a = 1; a <= N - i; a++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                
                if (j%2!=0){
//                    count++;
                    System.out.print(count++);
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
