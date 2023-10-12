import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem Vindo ao sistema de cadastro de Livros");



        Scanner leitor = new Scanner(System.in);

        Livro metodolivro = new Livro();

        Livro metodolistarLivro = new Livro();




        String opcao;
        do{
            System.out.println("Digite uma opcao: 1-Cadastrar Livro / 2-Listar Livro / 0-Sair");
            opcao = leitor.nextLine();

            switch (opcao) {
                case "1":

                    Livro novoLivro = new Livro();

                    System.out.println("Digite o titulo do livro");
                    novoLivro.titulo = leitor.nextLine();

                    System.out.println("Digite o Autor ");
                    novoLivro.nome = leitor.nextLine();

                    System.out.println("Digite o Preco ");
                    novoLivro.preco = leitor.nextFloat();

                    System.out.println("Digite a data de Lancamento: (dd/mm/aaaa)");
                    novoLivro.dataLancamento = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    Period dataAtual = Period.between(novoLivro.dataLancamento, LocalDate.now());

                    if (dataAtual.getYears() > 5) {
                        metodolivro.cadastrar(novoLivro);

                        System.out.println("Data Valida");
                    } else {
                        System.out.println("Digite data de Lancamento maior que 5 anos");
                    }

                    break;
                case "2":

                    if (metodolivro.listarLivro().size() > 0) {
                        for (Livro cadaitem : metodolivro.listarLivro()) {
                            System.out.println("titulo: " +cadaitem.titulo);
                            System.out.println("Nome: " + cadaitem.nome);
                            System.out.println("Preco: " + cadaitem.preco);
                            System.out.println("Data da Lancamento: " + cadaitem.dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                            System.out.println("Aperte ENTER para continuar");
                            leitor.nextLine(); // so para para o sistema.
                        }
                    } else {
                        System.out.println("Lista Vazia!'");
                    }

                    break;
                case "0":
                    System.out.println("Voltar");
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }

        } while (!opcao.equals("0"));
    }
}