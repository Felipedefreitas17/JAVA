package EstruturaRepeticao;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double valor1 = Double.parseDouble(leitor.nextLine());


        System.out.println("Digite o segundo valor: ");
        double valor2 = Double.parseDouble(leitor.nextLine());

        if (valor1 > valor2) {
            System.out.println(valor1);
        } else if (valor2 > valor1) {
            System.out.println(valor2);
        } else {
            System.out.println("Os numeros sao iguais");
        }
    }
}
