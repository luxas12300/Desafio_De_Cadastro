package Models.Controllers;

import Models.Cliente;
import Models.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeesController implements InterfaceCRUD{
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public void create() {
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.entrar();
        boolean funcionarioCadastrado = false;
        for(Funcionario funcionario : getFuncionarios()){
            if (funcionario.getId() == novoFuncionario.getId()){
                System.out.println("ID já cadastrado");
                funcionarioCadastrado = true;
                break;
            }
        }
        if (funcionarioCadastrado == false){
            this.getFuncionarios().add(novoFuncionario);
            System.out.println("Funcionário cadastrado");
            System.out.println(getFuncionarios());
        }
    }

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID a ser procurado");
        Integer id = scanner.nextInt();
        boolean funcionarioEncontrado = false;
        for(Funcionario funcionario : this.getFuncionarios()){
            if(funcionario.getId() == id){
                funcionarioEncontrado = true;
                funcionario.imprimir();
                break;
            }
        }
        if (!funcionarioEncontrado){
            System.out.println("Não cadastrado.");
        }

    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        boolean funcionarioEncontrado = false;
        int index = 0;
        for(Funcionario funcionario : this.getFuncionarios()){

            if(funcionario.getId() == id){
                Funcionario funcionario1 = new Funcionario();
                funcionarioEncontrado = true;
                funcionario1.entrar();
                funcionarios.remove(funcionario);
                funcionarios.add(index, funcionario1);
                System.out.println("Funcionário atualizado.");
                break;
            }
            index++;
        }
        if (!funcionarioEncontrado){
            System.out.println("Não cadastrado.");
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        Integer id = scanner.nextInt();
        boolean funcionarioEncontrado = false;
        for(Funcionario funcionario : this.getFuncionarios()){
            if(funcionario.getId() == id){
                funcionarioEncontrado = true;
                this.getFuncionarios().remove(funcionario);
                System.out.println("Funcionário removido.");
                System.out.println(getFuncionarios());
                break;
            }
        }
        if (!funcionarioEncontrado){
            System.out.println("Não cadastrado.");
        }

    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
