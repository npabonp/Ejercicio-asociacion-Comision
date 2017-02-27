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
public class EjercicioComision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Comision c = new Comision();
        double com =c.computeComision(10,20);
        System.out.println(com);
        double com2 = c.computeComision(1000);
        System.out.println(com2);
    }
    
}
