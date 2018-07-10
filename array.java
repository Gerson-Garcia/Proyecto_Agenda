/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_electronica;

/**
 *
 * @author Hosanna
 */
public class array {
  public void newarray(){
    System.out.println("Datos Introducidos...");
    String arregle []=new String[3];
       int numeros[]=new int[7];
        String espacio="    ";
       
        for (int i = 0; i < arregle.length; i++) {
                System.out.println(i + espacio+ (arregle[i]));
            }
          
        for (int i = 0; i < numeros.length; i++) {
                System.out.println(i + espacio+ (numeros[i]));
        }
        
             System.out.println("********************************************");
             System.out.println();
             
        principal callprincipal = new principal();
        callprincipal.newpincipal();
  }
    
}
