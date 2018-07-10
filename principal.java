/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_electronica;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class principal {
    public void newpincipal(){
        int opc;
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Agenda Electronica".toUpperCase());
        System.out.println("1. Crear Evento");
        System.out.println("2. Ver Eventos");
        System.out.println("3. Salir");
        
        System.out.println();
        
        System.out.println("Ingrese su eleccion");
        System.out.print("=>");
        opc = tec.nextInt();
        
         System.out.println();
         
         
        if(opc == 1){
            
            System.out.println("********************************************");
            crear_evento callnew=new crear_evento();
            callnew.newcrear();
                
            }else if(opc == 2){
                
                System.out.println("********************************************");
                array callarray=new array();
                callarray.newarray();
                
          
            }else if(opc == 3){
                password callpassword =new password();
                callpassword.newpassword();
                
            }else{
                System.out.println("\033[31mSeleccion Invalida ");
               
                System.out.println("********************************************");
                
                 principal callprincipal = new principal();
                   callprincipal.newpincipal();
               
         
        }
    }
}
