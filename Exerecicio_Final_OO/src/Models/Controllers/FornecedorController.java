package Models.Controllers;

import Models.Cliente;
import Models.Fornecedor;

import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class FornecedorController implements InterfaceCRUD{
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>();

    @Override
    public void create() {
        Fornecedor novoFornecedor = new Fornecedor();
        novoFornecedor.entrar();
        boolean fornecedorCadastrado = false;
        for (Fornecedor fornecedor : getFornecedores()){
            if(fornecedor.getId() == novoFornecedor.getId()){
                System.out.println("Fornecedor já cadastrado.");
                fornecedorCadastrado = true;
                break;
            }
        }
        if (fornecedorCadastrado == false){
            this.getFornecedores().add(novoFornecedor);
            System.out.println("Fornecedor cadastrado.");
            System.out.println(getFornecedores());
        }
    }

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID a ser procurado");
        Integer id = scanner.nextInt();
        boolean fornecedorEncontrado = false;
        for(Fornecedor fornecedor : this.getFornecedores()){
            if(fornecedor.getId() == id){
                fornecedorEncontrado = true;
                fornecedor.imprimir();
                break;
            }
        }
        if (!fornecedorEncontrado){
            System.out.println("Não cadastrado.");
        }

    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        boolean fornecedorEncontrado = false;
        int index = 0;
        for(Fornecedor fornecedor : this.getFornecedores()){

            if(fornecedor.getId() == id){
                Fornecedor fornecedor1 = new Fornecedor();
                fornecedorEncontrado = true;
                fornecedor1.entrar();
                fornecedores.remove(fornecedor);
                fornecedores.add(index, fornecedor1);
                break;
            }
            index++;
        }
        if (fornecedorEncontrado){
            System.out.println("Fornecedor atualizado.");
        }else{
            System.out.println("Não cadastrado.");
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        Integer id = scanner.nextInt();
        boolean fornecedorEncontrado = false;
        for(Fornecedor fornecedor : this.getFornecedores()){
            if(fornecedor.getId() == id){
                fornecedorEncontrado = true;
                this.getFornecedores().remove(fornecedor);
                break;
            }
        }
        if (fornecedorEncontrado){
            System.out.println("Fornecedor removido.");
        }else{
            System.out.println("Não cadastrado.");
        }

    }
    public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
}
