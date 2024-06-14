package Models;



public class Fornecedor extends PessoaJuridica {
    private Double limiteDeCompra;
    private String dataCadastro;

    public void entrar(){
        super.entrar();
        System.out.println("Digite o limite de compra: (Apenas números)");
        setLimiteDeCompra(scanner.nextDouble());
        System.out.println("Digite a data de cadastro:");
        setDataCadastro(scanner.nextLine());
    }

    public void imprimir(){

        super.imprimir();
        System.out.println("Data de cadastro: " + this.getDataCadastro());
        System.out.println("Limite de compra: " + this.getLimiteDeCompra());
    }

    public Double getLimiteDeCompra() {
        return limiteDeCompra;
    }

    public void setLimiteDeCompra(Double limiteDeCompra) {
        this.limiteDeCompra = limiteDeCompra;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
