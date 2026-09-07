/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto_java_1;

/**
 *
 * @author keynn
 */
public class Reto_Java_1 {

   public class ControladorVolumen{
       private int nivel;

        public ControladorVolumen(int nivel) {
            this.nivel = 50;
        }

        public int getNivel() {
            return nivel;
        }

        public void setNivel(int nivel) {
            this.nivel = nivel;
        }
       
       
   }
    
    public static void main(String[] args) {
        
        ControladorVolumen subirVolumen = new ControladorVolumen(70);
        ControladorVolumen bajarVolumen = new ControladorVolumen(20);
        if (nivel < 0 || nivel > 100) {
            System.out.println("Nivel de volumen invalido");
        }
        System.out.println("Volument actual: " + nivel);
        
    }
}
