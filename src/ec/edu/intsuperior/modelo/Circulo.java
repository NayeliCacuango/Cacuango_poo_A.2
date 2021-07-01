/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Home
 */
public class Circulo {
  private int radio;
private Punto centro;  

public Circulo (){
    
}

    public Circulo(int radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    public double areaCirculo (){
        return Math.PI*Math.pow((double)radio, 2);
    }

}


