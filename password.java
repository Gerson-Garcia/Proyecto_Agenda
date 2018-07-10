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
public class password {
    public void newpassword(){
         Scanner teclado = new Scanner(System.in);
	int pass = 0;
	int intentos = 1;
	int maximo = 3;
        int contador=0;
        System.out.println("   Iniciar Sesion!!");
        System.out.println();
        
        
	while((pass!=11) && (intentos<maximo)){
           
            System.out.println("Introduzca su password");
            System.out.print("=>");
            pass = teclado.nextInt();
            
            if (intentos==1){
                if( pass==11){
                    
                    System.out.println("********************************************");
                    System.out.println();
                    contador++;
                    System.out.println("Bienvenido eres el usuario#"+contador);
                    System.out.println();
                    System.out.println("********************************************");
                    
                   principal callprincipal = new principal();
                   callprincipal.newpincipal();
                   
                   
                } else{
                     System.out.println("Contraseña Incorrecta \033[31m(Solo tienes 3 intentos!!)");
     
                    System.out.println("\033[30m********************************************");
                    System.out.println();
                    intentos ++; 
                }
                
               
                  
            }else if (intentos==2){
                 if( pass==11){
                     System.out.println("********************************************");
                     System.out.println();
                     
                     contador++;
                    System.out.println("Bienvenido eres el usuario#"+contador);
                    System.out.println();
                    System.out.println("********************************************");
                     
                    principal callprincipal = new principal();
                    callprincipal.newpincipal();
                    
                  
                } else{
                      System.out.println("Contraseña Incorrecta \033[31m(Vuelva a intentarlo dentro de 2 minutos...)");
		
		intentos = intentos - maximo;
                try{
                    Thread.sleep(2*60*1000);
                }catch(InterruptedException ex){}
                System.out.println("\033[30m********************************************");
                   System.out.println();
                   intentos ++;
                 }
                   
                   
              
            }else{
                if(pass==11){
                    
                   System.out.println("********************************************");
                   System.out.println();
                   
                    contador++;
                    System.out.println("Bienvenido eres el usuario#"+contador);
                    System.out.println();
                    System.out.println("********************************************");
                   
                   principal callprincipal = new principal();
                   callprincipal.newpincipal();
                   
                    
                } else{
                    System.out.println("contraseña incorrecta \033[31m(Vuelva a intentarlo hasta  el siguiente año...)");
		
		intentos = intentos - maximo;
                try{
                    Thread.sleep(2*160*10000);
                }catch(InterruptedException ex){}
                intentos ++;
                 System.out.println("\033[30m********************************************");
                }
		
            }
            
            }
            
             
 
        }
    }

