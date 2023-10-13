package lab1_p1_diegorosales;
import java.util.Scanner;
public class LAB1_P1_DIEGOROSALES {

    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
         
        System.out.println("Elije el ejercicio introduciendo un numero entre el 1 y el 2, cualquier otron numero finalizara el programa");
        int numero = scanner.nextInt();
        
        if (numero==1) { 
        int n1 = 15;
        int n2 = 30;
        int resultado;
        resultado=n1*n2;
            System.out.println("Resultado: "+resultado);
        }
    
        else if (numero==2) { 
            System.out.println("Ingrese el numero de usuario 1: ");
            int numero_usuario_1 = scanner.nextInt();
            System.out.println("Ingrese el numero de usuario 2: ");
            int numero_usuario_2 = scanner.nextInt();
            System.out.println("Ingrese el numero de usuario 3: ");
            int numero_usuario_3 = scanner.nextInt();
            
            
            double promedio = (numero_usuario_1+numero_usuario_2+numero_usuario_3)/3;
            System.out.println("Promedio: "+promedio);
           
        }
        else {
        System.out.print("Salio del programa");
        }
    }
 
    
    
    
    
    }
    

