
package Ex4;

import java.util.Scanner;

public class Lista02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("REGRA DE 3");
        System.out.println("DIGITE PRIMEIRO VALOR:");
        double valor01 = ler.nextDouble();
        System.out.println("DIGITE SEGUNDO VALOR:");
        double valor02 = ler.nextDouble();
        System.out.println("DIGITE TERCEIRO VALOR:");
        double valor03 = ler.nextDouble();
        
        double desconhecido = valor03 * valor02 / valor01;
        
        System.out.println("O VALOR DE X É: " + desconhecido);
    }
    
}
