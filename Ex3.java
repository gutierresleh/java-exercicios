//3. Faça um programa que peça um número e imprime dizendo se é par ou
//ímpar.
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner receber = new Scanner(System.in);
        System.out.println("escreva um numero:");
        double  numero1 = receber.nextDouble(); 
        if(numero1 %2==0){ 
        System.out.println("Seu numero e par");
        }else{
            System.out.println("Seu numero e impar");
        }
     }  
    }    
    
