/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_ievade;

import java.util.Scanner;

/**
 *
 * @author lelde
 */
public class Day2_Ievade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ievade=new Scanner(System.in);
//        vardaIevade();
//raduKonvent();
logistika();
//        int skaitlis = ievade.nextInt();
//        System.out.println("Tu ievadīji skaitli: " +skaitlis);
    }
        //String teksts = ievade.next();
        static void vardaIevade(){
            Scanner ievade=new Scanner(System.in);
        System.out.println("Ievadi vardu:");
        String vards = ievade.next();
        System.out.println("Ievadi uzvardu:");
        String uzvards = ievade.next();
        System.out.println("Mani sauc " +vards+" "+uzvards);
        
        
    }
        static void graduKonvent(){
            Scanner ievade=new Scanner(System.in);
            
            int gradi;
            char mervieniba;
            
            System.out.println("Ievadi gradus:");
            gradi = ievade.nextInt();
            System.out.println("Ievadi ievadi mervienibu C vai F:");
            mervieniba=ievade.next().charAt(0);
            
            if(Character.toUpperCase(mervieniba)=='F'){
              System.out.println((gradi-32)/1.8 +"C");
            }
            else if(Character.toUpperCase(mervieniba)=='C'){
                double grF=gradi*1.8+32;
                System.out.println(grF +"C");
            }
            else{
                System.out.println("Nezinams rezultats!");
            }
        }
        
        static void logistika(){
            Scanner ievade=new Scanner(System.in);
            
            double km;
            double min;
            double degviela;
            
            System.out.println("Ievadi attalumu (km):");
            km = ievade.nextDouble();
            System.out.println("Ievadi laiku (min):");
            min=ievade.nextDouble();
            System.out.println("Ievadi patereto devielu (litros):");
            degviela=ievade.nextDouble();
            
            System.out.println();
            
            double h= min/60;
            double s=min*3600;
            double atrums=km/min;
            double atrumsH=km/h;
            double VidDegv=km/degviela;
            double VidDegv100=(100*degviela)/km;
            
            System.out.println("Pateretais laiks h: "+h);
            System.out.println("Pateretais laiks s: "+s);
            System.out.println("Atrums km/min: "+atrums);
            System.out.println("Atrums km/h: "+atrumsH);
            System.out.println("Videjais degv pateriņš (km/l): "+VidDegv);
            System.out.println("Videjais degv pateriņš (l/100km): "+VidDegv100);
        }
    
}
