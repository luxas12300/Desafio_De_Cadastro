package Interface;

import Models.Controllers.*;
import java.util.Scanner;

public class MenuPrincipal {
    private ClientsController clientsController = new ClientsController();
    private FornecedorController fornecedorController = new FornecedorController();
    private EmployeesController employeesController = new EmployeesController();
    private ContasAReceberController contasAReceberController = new ContasAReceberController();
    private ContasAPagarController contasAPagarController = new ContasAPagarController();

    public void exibirMenu() {

        boolean ligado = true;
        while (ligado) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bem-vindo ao menu de cadastros!\n");
            System.out.println("Digite 1 para cadastrar informações\n");
            System.out.println("Digite 2 para imprimir informações.\n");
            System.out.println("Digite 3 para atualizar informações.\n");
            System.out.println("Digite 4 para deletar informações.\n");
            System.out.println("Digite 5 para sair.\n");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Cadastra();
                    break;
                case 2:
                    Consulta();
                    break;
                case 3:
                    Update();
                    break;
                case 4:
                    Delete();
                    break;
                case 5:
                    System.out.println("Saindo");
                    System.exit(0);
                    break;
            }
        }
    }

    public void Cadastra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para cadastrar um Cliente");
        System.out.println("Digite 2 para cadastrar um Fornecedor");
        System.out.println("Digite 3 para cadastrar um Funcionario");
        System.out.println("Digite 4 para cadastrar uma Conta A Pagar.");
        System.out.println("Digite 5 para cadastrar uma Conta A Receber");
        int novaEscolha = scanner.nextInt();
        switch (novaEscolha) {
            case 1:
                clientsController.create();
                break;
            case 2:
                fornecedorController.create();
                break;
            case 3:
                employeesController.create();
                break;
            case 4:
                contasAPagarController.create();
                break;
            case 5:
                contasAReceberController.create();
                break;
            default:
                System.out.println("Saindo");
                System.exit(0);
        }
    }

    public void Update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para atualizar um cliente");
        System.out.println("Digite 2 para atualizar um fornecedor");
        System.out.println("Digite 3 para atualizar um funcionário");
        System.out.println("Digite 4 para atualizar uma Conta a Pagar");
        System.out.println("Digite 5 para atualizar uma Conta a Receber");
        int consultaUpdate = scanner.nextInt();
        switch (consultaUpdate) {
            case 1:
                clientsController.update();
                break;

            case 2:
                fornecedorController.update();
                break;

            case 3:
                employeesController.update();
                break;

            case 4:
                contasAPagarController.update();
                break;

            case 5:
                contasAReceberController.update();
                break;
        }
    }

    public void Delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para deletar um cliente");
        System.out.println("Digite 2 para deletar um fornecedor");
        System.out.println("Digite 3 para deletar um funcionário");
        System.out.println("Digite 4 para deletar uma Conta a Pagar");
        System.out.println("Digite 5 para deletar uma Conta a Receber");
        int consultaDeleta = scanner.nextInt();
        switch (consultaDeleta) {
            case 1:
                clientsController.delete();
                break;

            case 2:
                fornecedorController.delete();
                break;

            case 3:
                employeesController.delete();
                break;

            case 4:
                contasAPagarController.delete();
                break;

            case 5:
                contasAReceberController.delete();
                break;
        }
    }

    public void Consulta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para imprimir um cliente");
        System.out.println("Digite 2 para imprimir um fornecedor");
        System.out.println("Digite 3 para imprimir um funcionário");
        System.out.println("Digite 4 para verificar uma Conta a Pagar");
        System.out.println("Digite 5 para verificar uma Conta a Receber");
        int consulta = scanner.nextInt();
        switch (consulta) {
            case 1:
                clientsController.read();
                break;

            case 2:
                fornecedorController.read();
                break;

            case 3:
                employeesController.read();
                break;

            case 4:
                contasAPagarController.read();
                break;

            case 5:
                contasAReceberController.read();
                break;
        }
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

    public EmployeesController getEmployeesController() {
        return employeesController;
    }

    public void setEmployeesController(EmployeesController employeesController) {
        this.employeesController = employeesController;
    }

    public ContasAReceberController getContasAReceberController() {
        return contasAReceberController;
    }

    public void setContasAReceberController(ContasAReceberController contasAReceberController) {
        this.contasAReceberController = contasAReceberController;
    }

    public ContasAPagarController getContasAPagarController() {
        return contasAPagarController;
    }

    public void setContasAPagarController(ContasAPagarController contasAPagarController) {
        this.contasAPagarController = contasAPagarController;
    }
}
