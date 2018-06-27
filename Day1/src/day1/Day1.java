/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author lelde
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Kvadrats kv1; //kv1=null nav defnēts
//        kv1= new Kvadrats(); //kv1=Kvadrats klases objektu
//        
//        kv1.setMalasGarums(5.5);
//        kv1.setKrasa("sarkans");
//        double laukums = kv1.laukums();
//        double perimetrs = kv1.perimetrs();
//        
//        Kvadrats kv2= new Kvadrats(5,"melns");
//        laukums=kv2.laukums();
//        perimetrs=kv2.perimetrs();
//        
//        System.out.println("Kvadrāts 1 laukums = "+kv1.laukums());
//        System.out.println("Kvadrāts 1 perimetrs = "+kv1.perimetrs());
//        System.out.println("Kvadrāts 1 perimetrs = "+kv1.getKrasa());
//        System.out.println("Kvadrāts 2 laukums = "+kv2.laukums());
//        System.out.println("Kvadrāts 2 perimetrs = "+kv2.perimetrs());

//       Telpa fizika;
//       fizika = = new Telpa(12,5);
       Lidmasinas lidmasina = new Lidmasinas();
//       lidmasina.parvietoties();
       Auto auto = new Auto();
//       auto.parvietoties();
       parvietot(auto);
       parvietot(lidmasina);
       
       Direktors d= new Direktors();
       d.Uzvards="Liepins";
       d.Vards="Janis";
       
       darbiniekaVards(d);
       
       
    }
    static void darbiniekaVards(Darbinieks d){
        System.out.println(d.toString());
    }
    static void parvietot(Transportlidzeklis tr){
        tr.parvietoties();;
    }
}
