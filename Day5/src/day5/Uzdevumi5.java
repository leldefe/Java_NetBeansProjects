/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lelde
 */
public class Uzdevumi5 {

    private static Scanner ievade = new Scanner(System.in);

    public static void Piemeri() {
        System.out.print("Ievadi valsti: ");
        String valsts = ievade.next().toLowerCase();

        switch (valsts) {
            case "latvija":
                System.out.println("Galvaspilsēta Rīga");
                break;

            case "lietuva":
                System.out.println("Galvaspilsēta Viļņa");
                break;

            default:
                System.out.println("Galvaspilsēta nav zināma");
                break;
        }

    }
    
    public static void MasiviSaraksti(){
        int[] skaitluMasivs=new int [3];
        skaitluMasivs[0]=5;
        skaitluMasivs[1]=5;
        skaitluMasivs[2]=5;
        
        int[] skaitluMasivs2={5, 9, 1};
        int masivaIeraksti=skaitluMasivs2.length;
        int tresaisSkaitlis=skaitluMasivs[2];
        boolean irCetri=false;
        for(int skaitlis:skaitluMasivs2){
            System.out.println(skaitlis);
            if(skaitlis==4){
                System.out.println("Skaitlis 4 ir masīvā");
                irCetri=true;
            }
        }
        if(!irCetri){
            System.out.print("Skaitlis 4 nav masīvā");
        }
        
        ArrayList<String> tekstaSaraksts=new ArrayList<String>();
        tekstaSaraksts.add("teksts1");
        tekstaSaraksts.add("teksts2");
        tekstaSaraksts.add("teksts3");
        
        int sakastaIeraksti = tekstaSaraksts.size();
        String tresaisVards = tekstaSaraksts.get(2);
        for(String vards:tekstaSaraksts){
            System.out.println(vards);
        }
    }

    public static void Uzd24() {
        System.out.print("Ievadi Sk1: ");
        int sk1 = ievade.nextInt();
        System.out.print("Ievadi darbību (+, -, *, /): ");
        char darb1 = ievade.next().charAt(0);
        System.out.print("Ievadi Sk2: ");
        int sk2 = ievade.nextInt();
        System.out.print("Ievadi darbību (+, -, *, /): ");
        char darb2 = ievade.next().charAt(0);
        System.out.print("Ievadi Sk3: ");
        int sk3 = ievade.nextInt();

        double rezultats;
        if (darb1 == '*' || darb1 == '/') {
            rezultats = aprekins(sk1, sk2, darb1);
            rezultats = aprekins(rezultats, sk3, darb2);
        } else {
            rezultats = aprekins(sk2, sk3, darb2);
            rezultats = aprekins(sk1, rezultats, darb1);
        }
        System.out.print("Rezultats = " + rezultats);

    }

    private static double aprekins(double sk1, double sk2, char darb) {

        switch (darb) {
            case '*':
                return sk1 * sk2;
            case '/':
                return sk1 / sk2;
            case '+':
                return sk1 + sk2;
            case '-':
                return sk1 - sk2;
            default:
                return 0;
        }

    }

}
