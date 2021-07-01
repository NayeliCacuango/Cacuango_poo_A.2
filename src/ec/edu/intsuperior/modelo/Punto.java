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
public class Punto {
   private int x;
 private int y;
 //metodo especial que tiene el mismo nombre
 //de la clase que tiene la misma clase de datos para asignar valores
 //constructor por defecto
 public Punto() {
     
 }
public Punto(int x, int y) {
     this.x=x;
     this.y=y;
     }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
 
 public void setY(int y){
     this.y=y;
 }

    public int getY() {
        return y;
    } 
    
    public double distanciaDosPuntos(int x2, int x1, int y2, int y1){
        
        double d;
        //realizamos la ecuacion para encontrar la distacia entre dos puntos
        //la raiz cuadrado de x2-x1 al cuadrado mas y2-y1 al cuadrado
       double w= Math.pow((double)(x2-x1), 2); //la coma hace la potecia, debe ser con double
       double z= Math.pow((double)(y2-y1), 2);
       //math es una clase
        // sqrt es un metodo de clase, necesita un parametro double
          d=Math.sqrt(w+z);
        return d;
        
    }
    //Otro ejercicio: para medir la distacia  del punto al centro 0,0
    public double distanciaAlCentro (int x2, int y2){
        return distanciaDosPuntos(x2, 0, y2, 0);
    }
}

