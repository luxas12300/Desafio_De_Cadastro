package Models.Financeiro;

import Models.Cliente;
import Models.Controllers.FornecedorController;
import Models.Fornecedor;
import Models.Controllers.ClientsController;

import java.sql.SQLOutput;

public class ContasAPagar extends Financeiro{
    private Fornecedor fornecedor;
    private int boleto;

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("Digite o código do boleto");
        setBoleto(scanner.nextInt());
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.entrar();
        setFornecedor(fornecedor1);

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Boleto: " + this.getBoleto());
        fornecedor.imprimir();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getBoleto() {
        return boleto;
    }

    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }
}
