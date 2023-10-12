import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro extends Autor {

    public String titulo;

    public float preco;

    public LocalDate dataLancamento;

    public ArrayList<Livro> listaLivro = new ArrayList<>();

    public void cadastrar(Livro livro) {

        listaLivro.add(livro);

        System.out.println("Cadastro realizado com sucesso!");
    }

    public ArrayList<Livro> listarLivro(){
        return listaLivro;
    }
    }
