//1. Faça um programa que peça dois números inteiros, imprima a soma
//desses dois números na tela.
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){

       Scanner entrada = new Scanner(System.in);//buffer memória

       String nome = entrada.nextLine();//abre uma caixa para escrever 
       System.out.println("Ola, "+ nome + "Escreva o primeiro numero");//mostra
       double numero = entrada.nextDouble();
       System.out.println( "Escreva o segundo numero");
       double number = entrada.nextDouble();

       double total = number+numero;
       System.out.println(" Seu valor " + total);
    }

}
