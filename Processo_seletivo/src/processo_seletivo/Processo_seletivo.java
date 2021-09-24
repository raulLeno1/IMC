package processo_seletivo;

import java.util.Scanner;

public class Processo_seletivo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Insira seu nome completo");
        String nome = scan.nextLine();
        nome = nome.toUpperCase();
        System.out.println("Insira sua altura");
        double m = scan.nextDouble();
        
        System.out.println("Insira seu Peso");
        double kg = scan.nextDouble();
        
        double imc = kg/(m*2);
        
        System.out.printf(nome+" %.2f", imc);
        
        
        

        
        
        
    }
    
}
