/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocomision;

/**
 *
 * @author Estudiante
 */
public class Comision {
   private double sales;
   private double rate;


   
   public double computeComision (double a, double b){
       a = this.rate;
       b = this.sales;
       return (a*b);
   }
   public double computeComision (double a){
       a = this.rate;
       return (a*0.075);
   }   
}
