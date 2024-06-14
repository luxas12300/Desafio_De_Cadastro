package Models.Financeiro;

import Models.Cliente;
import Models.Controllers.ClientsController;
import Models.Controllers.FornecedorController;
import Models.Fornecedor;

import java.sql.SQLOutput;

public class ContasAReceber extends Financeiro{
    private Cliente cliente;
    private Fornecedor fornecedor;
    private ClientsController clientsController;
    private FornecedorController fornecedorController;
    private int notaFiscal;

    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Nota Fiscal: " + this.getNotaFiscal());

    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("Digite a nota Fiscal");
        setNotaFiscal(scanner.nextInt());
        Cliente cliente1 = new Cliente();
        cliente1.entrar();
        setCliente(cliente1);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ClientsController getClientsController() {
        return clientsController;
    }

    public void setClientsController(ClientsController clientsController) {
        this.clientsController = clientsController;
    }

    public FornecedorController getFornecedorController() {
        return fornecedorController;
    }

    public void setFornecedorController(FornecedorController fornecedorController) {
        this.fornecedorController = fornecedorController;
    }
}
