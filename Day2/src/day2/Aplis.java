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
public class Aplis implements Figura {
double Radiuss;
String Krasa;

    @Override
    public double laukums() {
        return this.Radiuss*this.Radiuss*this.Radiuss;
    }

    @Override
    public String krasa() {
        return Krasa;
    }

    @Override
    public double perimetrs() {
        return 2*Math.PI*this.Radiuss;
    }
    
}
