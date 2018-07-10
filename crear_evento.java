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
public class crear_evento {
    public void newcrear(){
       String arregle []=new String[3];
       int numeros[]=new int[7];
       
        Scanner teclado=new Scanner(System.in);
        int seleccion;
       
        System.out.println("Ingresar Datos \033[31m(Es necesario llenar los campos)");
        System.out.println();
        
        System.out.println("\033[30mTitulo del Evento");
        System.out.print("=>");
        arregle[0]=teclado.nextLine();
        
        
        System.out.println();
        
        System.out.println("Detalles del Evento");
        System.out.print("=>");
        arregle[1]=teclado.nextLine();
        
        System.out.println();
     
        System.out.println("Ubicacion del Evento");
        System.out.print("=>");
        arregle[2]=teclado.nextLine();
        
        System.out.println();
        
        //Fecha...............................
        
          //condicion dia......................................................
        do{
            System.out.println("Ingrese el dia \033[31m(ojo numero de el dia!!)");
            System.out.print("\033[30m=>");
            numeros[0]=teclado.nextInt();
         System.out.println();
            
            if (numeros[0]<=31){
                
              System.out.println(numeros[0]);
               System.out.println();
               break;
             
            }else{
                System.out.println("Dato Invalido)");
                System.out.println();
                
            }
        }while(numeros[0]>31);
        
        
        
        //condicion mes........................................................
        
        do{
            System.out.println("Ingrese el mes \033[31m(ojo numero de el mes!!)");
            System.out.print("\033[30m=>");
            numeros[1]=teclado.nextInt();
            System.out.println();
            
            if (numeros[1]<=12){
                
              System.out.println( numeros[1]);
              System.out.println();
              break;
             
            }else{
                System.out.println("Dato Invalido)");
                System.out.println();
                
                
            }
        }while(numeros[1]>13);
        
        
            //condicion anio...........................................
        
        
        
         do{
            System.out.println("Ingrese el año \033[31m(ojo numero de el año!!)");
            System.out.print("\033[30m=>");
             numeros[2]=teclado.nextInt();
            System.out.println();
            
            if ( numeros[2]>=2018){
                
              System.out.println( numeros[2]);
              System.out.println();
              break;
             
            }else{
                System.out.println("Dato Invalido)");
                System.out.println();
                
            }
        }while( numeros[2]<2018);
         
        //Hora inicio y minutos........................................
         
         
        do{
            System.out.println("Hora inicio del Evento \033[31m(ojo solo numero de hora!!)");
            System.out.print("\033[30m=>");
             numeros[3]=teclado.nextInt();
            if( numeros[3]<=23){
                System.out.println( numeros[3]);
            }else{
                System.out.println("Dato Invalido");
                System.out.println();
            }
        }while( numeros[3] > 24);
        
        
        do{
            System.out.println("Ingrese minuttos");
            System.out.print("\033[30m=>");
             numeros[4]=teclado.nextInt();
            if( numeros[4]<=59){
                System.out.println( numeros[4]);
                System.out.println();
            }else{
                System.out.println("Dato Invalido");
                System.out.println();
            }
        }while( numeros[4] > 59);
        
        //Hora fin y minutos...............................................
        
        
        
         do{
          
            System.out.println("Hora Fin del Evento \033[31m(ojo solo la hora!!)");
            System.out.print("\033[30m=>");
             numeros[5]=teclado.nextInt();
            if( numeros[5]<=23){
                System.out.println( numeros[5]);
            }else{
                System.out.println("Dato Invalido");
                System.out.println();
            }
            
            
        }while( numeros[5] > 23);
         
         do{
            System.out.println("Ingrese minuttos");
            System.out.print("\033[30m=>");
             numeros[6]=teclado.nextInt();
            if( numeros[6]<=59){
                System.out.println( numeros[6]);
                 System.out.println();
                
            }else{
                System.out.println("Dato Invalido");
                System.out.println();
            }
        }while( numeros[6] > 59);
         
         //Arrray
        
         
         //informacion mostrada por pantalla
         
       
       
        
        System.out.println("\033[30m********************************************");
        System.out.println();
        System.out.println("         Datos Introducidos".toUpperCase());
        System.out.println();
       
        System.out.println("Titulo del Evento =  " + arregle[0] );
        System.out.println("Detalles del Evento =  "+arregle[1]);
        System.out.println("Ubicaciion del Evento =  "+arregle[2]); 
        System.out.println("Hora Inicio del Evento =  "+numeros[0]+"/"+numeros[1]+"/"+numeros[2]);
    
        System.out.println("Hora Inicio del Evento =  "+numeros[3]+":"+numeros[4]);
        System.out.println("Hora Fin del Evento =  "+numeros[5]+":"+numeros[6]); 
        
  
        System.out.println();
        System.out.println("\033[30m********************************************");
        
        
           
        System.out.println("¿Su informacion es correcta?  \033[31m( 1=si / 2=no)");
        System.out.print("\033[30m=>");
        seleccion=teclado.nextByte();
       
        if (seleccion==1){
            
            System.out.println("Su informacion se Guardo con exito!!".toUpperCase());
            System.out.println();
            System.out.println("********************************************");
            
            
            System.out.println("********************************************");
            
            
            principal callprincipal=new principal();
            callprincipal.newpincipal();
         
            }else if (seleccion==2){
            System.out.println("********************************************");
            System.out.println();

            principal callprincipal=new principal();
            callprincipal.newpincipal();
               
        }
               
        
    }
}