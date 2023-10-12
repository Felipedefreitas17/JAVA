import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<PessoaFisica> listaPf = new ArrayList<>();
        PessoaFisica metodoPf = new PessoaFisica();

        ArrayList<PessoaJuridica> listaPj = new ArrayList<>();
        PessoaJuridica metodoPj = new PessoaJuridica();


        System.out.println("Bem Vindo ao sistema de cadastro de Pessoas Fisicas e Juridicas");

        Scanner leitor = new Scanner(System.in);

        String opcao;
        do {
            System.out.println("Escolha uma opcao: 1-Pessoa Fisica/ 2-Pessoa juridica / 0-Sair");
            opcao = leitor.nextLine();

            switch (opcao) {
                case "1":
                    String opcaoPf;
                    do {
                        System.out.println("Digite uma opcao: 1-Cadastrar PF / 2-Listar PF / 0-Voltar");
                        opcaoPf = leitor.nextLine();

                        switch (opcaoPf) {
                            case "1":
                                PessoaFisica novaPf = new PessoaFisica();
                                Endereco novoEndPf = new Endereco();

                                System.out.println("Digite o nome");
                                novaPf.nome = leitor.nextLine();

                                System.out.println("Digite o cpf");
                                novaPf.cpf = leitor.nextLine();

                                System.out.println("Digite o rendimento");
                                novaPf.rendimento = leitor.nextFloat();

                                System.out.println("Digite a data de nascimento: (dd/mm/aaaa)");
                                novaPf.dataNascimento = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                                Period idade = Period.between(novaPf.dataNascimento, LocalDate.now());

                                if (idade.getYears() >= 18) {
                                    System.out.println("Idade Valida");
                                } else {
                                    System.out.println("Idade Invalida");
                                    break;
                                }

                                System.out.println("Digite o logradouro");
                                novoEndPf.logradouro = leitor.next();

                                System.out.println("Digite o numero");
                                novoEndPf.numero = leitor.nextInt();

                                System.out.println("Este endereco e comercial ? S/N");
                                String endCon = leitor.next();
                                if (endCon.equals("S") || endCon.equals("s")) {
                                    novoEndPf.endComercial = true;
                                } else {
                                    novoEndPf.endComercial = false;
                                }

                                novaPf.endereco = novoEndPf;

                                listaPf.add(novaPf);

                                System.out.println("Cadastro realizado com sucesso!");

                                break;
                            case "2":

                                if (listaPf.size() > 0) {

                                    for (PessoaFisica cadaPf : listaPf) {
                                        System.out.println("Nome: " + cadaPf.nome);
                                        System.out.println("CPF: " + cadaPf.cpf);
                                        System.out.println("Data da Nascimento: " + cadaPf.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                                        System.out.println("Endereco: " + cadaPf.endereco.logradouro + " - " + cadaPf.endereco.numero);
                                        System.out.println("Imposto a ser pago: " + metodoPf.CaucularImposto(metodoPf.rendimento));
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

                    } while (!opcaoPf.equals("0"));

                    break;

                case "2":

                    String opcaoPj;
                    do{
                        System.out.println("Digite uma opcao: 1-Cadastrar PJ / 2-Listar PJ / 0-Voltar");
                        opcaoPj = leitor.nextLine();

                        switch (opcaoPj){
                            case "1":
                                PessoaJuridica novaPj = new PessoaJuridica();
                                Endereco novoEndPj = new Endereco();

                                System.out.println("Digite o nome");
                                novaPj.nome = leitor.nextLine();

                                System.out.println("Digite a Razao Social");
                                novaPj.razaoSocial = leitor.nextLine();

                                System.out.println("Digite o cnpj");
                                novaPj.cnpj = leitor.nextLine();

                                System.out.println("Digite o rendimento");
                                novaPj.rendimento = leitor.nextFloat();


                                System.out.println("Digite o logradouro");
                                novoEndPj.logradouro = leitor.next();

                                System.out.println("Digite o numero");
                                novoEndPj.numero = leitor.nextInt();

                                System.out.println("Este endereco e comercial ? S/N");
                                String endCon = leitor.next();
                                if (endCon.equals("S") || endCon.equals("s")) {
                                    novoEndPj.endComercial = true;
                                } else {
                                    novoEndPj.endComercial = false;
                                }

                                novaPj.endereco = novoEndPj;

                                listaPj.add(novaPj);

                                System.out.println("Cadastro realizado com sucesso!");

                                break;

                            case "2":

                                if (listaPj.size() > 0) {

                                    for (PessoaJuridica cadaPj : listaPj) {
                                        System.out.println("Nome: " + cadaPj.nome);
                                        System.out.println("Razao Social: " + cadaPj.razaoSocial);
                                        System.out.println("CNPJ: " + cadaPj.cnpj);
                                        System.out.println("Endereco: " + cadaPj.endereco.logradouro + " - " + cadaPj.endereco.numero);
                                        System.out.println("Imposto a ser pago: " + metodoPj.CaucularImposto(metodoPj.rendimento));
                                        System.out.println("Aperte ENTER para continuar");
                                        leitor.nextLine(); // so parar para o sistema.
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
                    }while (!opcaoPj.equals("0"));

                case "0":
                    System.out.println("caso 0");
                    break;

                default:
                    System.out.println("default");
                    break;
            }
        } while (!opcao.equals("0"));
    }
}

