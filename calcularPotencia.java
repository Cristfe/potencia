/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularPotencia;

/**
 *
 * @author Crist
 */
public class calcularPotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 5;
        int exponente = 3;
        
        int resultado = 1;
        int i;
        for(i=1; i<exponente; i++){
            resultado = (resultado*base);}
            
            System.out.println("El resultado es" +   resultado);
        }
    }
    

