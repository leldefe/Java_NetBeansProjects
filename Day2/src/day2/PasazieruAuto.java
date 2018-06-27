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
public class PasazieruAuto extends Transportlidzeklis{
    int maxPasazieri;
    
    public PasazieruAuto(String razotajs, String marka, int gads, int maxPasazieri) {
        super(razotajs, marka, gads);
        this.maxPasazieri=maxPasazieri;
        
    }
    
    
}
