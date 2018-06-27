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
public class Kvadrats implements Figura {
    int MalasGarums;
    String Krasa;
  
      @Override
    public double laukums() {
        return (this.MalasGarums*this.MalasGarums);

    }

    @Override
    public String krasa() {
        return this.Krasa;
    }

    @Override
    public double perimetrs() {
        return this.MalasGarums*4;
    }
    
}
