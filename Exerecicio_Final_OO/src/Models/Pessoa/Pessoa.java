package Models.Pessoa;

import Interface.InterfaceCadastro;
import Models.PessoaFisica;
import Models.PessoaJuridica;

import java.util.Scanner;

public abstract class Pessoa implements InterfaceCadastro {
    private long id;
    private String nome;
    private Endereco endereco;
   private Telefone telefone;
    private String email;
    private int anoDeNascimento;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;


@Override
    public void entrar(){
    System.out.println("Digite o id: (Apenas números)");
    this.setId(scanner.nextLong());
    System.out.println("Digite o nome da Pessoa");
    this.setNome(scanner.nextLine());
    System.out.println("Digite o email");
    this.setEmail(scanner.nextLine());
    System.out.println("Digite o ano de nascimento. (Apenas números)");
    this.setAnoDeNascimento(scanner.nextInt());
    Endereco endereco1 = new Endereco();
    Telefone telefone1 = new Telefone();
    endereco1.entrar();
    this.setEndereco(endereco1);
    telefone1.entrar();
    this.setTelefone(telefone1);
}
    @Override
    public void imprimir(){
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Ano de nascimento: " + this.getAnoDeNascimento());
        this.endereco.imprimir();
        this.telefone.imprimir();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }
}
