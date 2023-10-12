package EstruturaRepeticao;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero, para verificar se o positivo ou negativo: "); // console.log() no javascript

        double numero = Double.parseDouble(leitor.nextLine());

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
        System.out.println("Neutro");
    }
}
}
