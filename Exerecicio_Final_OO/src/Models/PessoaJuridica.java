package Models;

import Models.Controllers.ClientsController;
import Models.Controllers.FornecedorController;
import Models.Pessoa.Pessoa;

public abstract class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String contato;
    private ClientsController clientsController;
    private FornecedorController fornecedorController;

    public void entrar(){

        super.entrar();
        System.out.println("Pessoa Jurídica");
        System.out.println("Digite o CNPJ \n");
        this.setCnpj(scanner.nextLine());
        System.out.println("Digite a inscrição estadual");
        this.setInscricaoEstadual(scanner.nextLine());
        System.out.println("digite o contato");
        this.setContato(scanner.nextLine());

    }
    public void imprimir(){

        super.imprimir();
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Inscrição estadual: " + this.getInscricaoEstadual());
        System.out.println("Contato: " + this.getContato());

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        contato = contato;
    }

}
