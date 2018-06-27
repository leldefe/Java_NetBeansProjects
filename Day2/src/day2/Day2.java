/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author lelde
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kvadrats kv1=new Kvadrats();
        kv1.MalasGarums=5;
        kv1.Krasa="Sarkans";
        System.out.println(kv1.krasa()+" "+kv1.laukums()+" "+kv1.perimetrs());
        
        Aplis apl1=new Aplis();
        apl1.Radiuss=5;
        apl1.Krasa="Sarkans";
        System.out.println(apl1.krasa()+" "+apl1.laukums()+" "+apl1.perimetrs());
        
        KravasTransportlidzeklis kr=new KravasTransportlidzeklis("aaa", "aaaa", 5, 5);
        System.out.println(kr.toString());
    }
    static void Izvade(Figura figura){
       
    }
}
