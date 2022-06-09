//2. Escreva um programa que leia um valor em metros e o exiba convertido
//em centímetros.
import java.util.Scanner;
 public class Ex2{ 
public static void main(String[] args){
    Scanner receber = new Scanner(System.in);
    System.out.println("escreva seu valor em metros:");
    double  numero1 = receber.nextDouble();
    double total = numero1*100;
    System.out.println("seu valor e igual a "+  total+" centimetros") ;
    
}

    
}
