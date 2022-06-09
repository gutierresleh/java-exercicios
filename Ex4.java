//4. Escreva um programa que pergunte a velocidade do carro de um usuário.
  //Caso ultrapasse 80 Km/h, exiba uma mensagem dizendo que o usuário
//foi multado. Nesse caso, exiba o valor da multa, cobrando R$ 5 por Km
//acima de 80km/h
import java.util.Scanner;
public class Ex4 {
    
    public static void main(String[] args){
        Scanner receber = new Scanner(System.in);
        System.out.println("escreva a velocidade do seu carro:");
        double  numero1 = receber.nextDouble(); 
        if(numero1 > 80){ 
            Double acima = numero1 - 80;
            double multa = acima * 5;
        System.out.println("Voce ultrapassou a velocidade permitida sua multa e de: "+multa+" reais");
        }else{
            System.out.println("Voce esta dentro do limite permitido");
        }
     }  
    }    
    
