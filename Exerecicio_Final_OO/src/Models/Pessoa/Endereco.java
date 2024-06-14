package Models.Pessoa;

import java.util.Scanner;

public class Endereco{
    private String rua,bairro,referencia,cidade, estado;
    private int cep;

    public Endereco(){}

    public Endereco(String rua,String bairro,String referencia,String cidade,String estado,int cep){
        this.rua = rua;
        this.bairro = bairro;
        this.referencia = referencia;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    //@Override
    public void entrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a rua");
        this.setRua(scanner.nextLine());
        System.out.println("Digite o bairro");
        this.setBairro(scanner.nextLine());
        System.out.println("Digite a referência");
        this.setReferencia(scanner.nextLine());
        System.out.println("Digite a cidade");
        this.setCidade(scanner.nextLine());
        System.out.println("Digite o estado");
        this.setEstado(scanner.nextLine());
        System.out.println("Digite o CEP. (Apenas números)");
        this.setCep(scanner.nextInt());

    }
    //@Override
    public void imprimir(){
        System.out.println("Rua: " + this.getRua());
        System.out.println("Bairro: " + this.getBairro());
        System.out.println("Referência: " + this.getReferencia());
        System.out.println("Cidade: " + this.getCidade());
        System.out.println("Estado: " + this.getEstado());
        System.out.println("CEP: " + this.getCep());
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
