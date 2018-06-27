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
public class KravasTransportlidzeklis extends Transportlidzeklis{
    
    double kravasIetilpiba;

    public KravasTransportlidzeklis(String razotajs, String marka, int gads, double kravasIetilpiba) {
        super(razotajs, marka, gads);
        
        this.kravasIetilpiba=kravasIetilpiba;
    }
@Override
public String toString(){
    String teksts=super.toString();
    teksts +=", ietilpiba= "+this.kravasIetilpiba;
    
    return teksts;
    
    
}
}
