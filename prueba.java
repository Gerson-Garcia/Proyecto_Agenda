/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_electronica;

import java.util.Scanner;

/**
 *
 * @author Hosanna
 */
public class prueba {
    public void newprueba(){
        Scanner teclado=new Scanner(System.in);
        int dia;
        int mes;
        int año;
        int hora;
        int minutos;
        int fin;
        int mfin;
        
          //condicion dia......................................................
        do{
            System.out.println("Ingrese el dia \033[31m(ojo numero de el dia!!)");
            System.out.print("\033[30m=>");
            dia=teclado.nextInt();
            System.out.println();
            
            if (dia<31){
                
              System.out.println(dia);
               System.out.println();
               break;
             
            }else{
                System.out.println("Dato Invalido)");
                System.out.println();
                
            }
        }while(dia>=30);
        
        //condicion mes........................................................
        
        do{
            System.out.println("Ingrese el mes \033[31m(ojo numero de el mes!!)");
            System.out.print("\033[30m=>");
            mes=teclado.nextInt();
            System.out.println();
            
            if (mes<12){
                
              System.out.println(mes);
              System.out.println();
              break;
             
            }else{
                System.out.println("Dato Invalido)");
                System.out.println();
                
                
            }
        }while(mes>12);
        
        
            //condicion anio...........................................
        
         do{
            System.out.println("Ingrese el año \033[31m(ojo numero de el año!!)");
            System.out.print("\033[30m=>");
            año=teclado.nextInt();
            System.out.println();
            
            if (año>=2018){
                
              System.out.println(año);
              System.out.println();
              break;
             
            }else{
                System.out.println("Dato Invalido)");
                System.out.println();
                
            }
        }while(año<2018);
         
        //Hora inicio y minutos........................................
        do{
            System.out.println("Hora inicio del Evento \033[31m(ojo solo numero de hora!!)");
            System.out.print("\033[30m=>");
            hora=teclado.nextInt();
            if(hora<=23){
                System.out.println(hora);
            }else{
                System.out.println("Dato Invalido");
                System.out.println();
            }
        }while(hora > 23);
        
        do{
            System.out.println("Ingrese minuttos");
            System.out.print("\033[30m=>");
            minutos=teclado.nextInt();
            if(minutos<=59){
                System.out.println(minutos);
                System.out.println();
            }else{
                System.out.println("Dato Invalido");
                System.out.println();
            }
        }while(minutos > 59);
        
        //Hora fin y minutos...............................................
        
         do{
          
            System.out.println("Hora Fin del Evento \033[31m(ojo solo la hora!!)");
            System.out.print("\033[30m=>");
            fin=teclado.nextInt();
            if(fin<=23){
                System.out.println(fin);
            }else{
                System.out.println("Dato Invalido");
                System.out.println();
            }
            
            
        }while(fin > 23);
         
          do{
            System.out.println("Ingrese minuttos");
            System.out.print("\033[30m=>");
            mfin=teclado.nextInt();
            
            if(mfin<=59){
                System.out.println(mfin);
                System.out.println();
            }else{
                System.out.println("Dato Invalido");
                System.out.println();
            }
        }while(mfin > 59);
        
        
        
         
         
    }
}
