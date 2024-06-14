package Models.Controllers;
import Models.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientsController implements InterfaceCRUD {
    private ArrayList<Cliente> clientes = new ArrayList<>();



    @Override
    public void create() {
        Cliente novoCliente = new Cliente();
        novoCliente.entrar();
        boolean existeCliente = false;
        for (Cliente cliente: this.getClientes()){
            if (cliente.getId() == novoCliente.getId()){
                System.out.println("ID já cadastrado.");
                existeCliente = true;
                break;
            }
        }
        if (existeCliente == false){
            this.getClientes().add(novoCliente);
            System.out.println("Cliente Cadastrado");
            System.out.println(this.getClientes());
        }
    }

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID");
        int consultaCNPJ = scanner.nextInt();
        boolean clienteEncontrado = false;
        for(Cliente cliente : this.getClientes()){
            if(cliente.getId() == consultaCNPJ){
                clienteEncontrado = true;
                cliente.imprimir();
                break;
            }
        }
        if (!clienteEncontrado){
            System.out.println("Não cadastrado.");
        }

    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID a ser atualizado");
        int id = scanner.nextInt();
        boolean clienteEncontrado = false;
        int index = 0;
        for(Cliente cliente : this.getClientes()){
            if(cliente.getId() == id){
                Cliente novoCliente = new Cliente();
                clienteEncontrado = true;
                novoCliente.entrar();
                clientes.remove(cliente);
                clientes.add(index, novoCliente);
                break;
            }
            index++;
        }
        if (clienteEncontrado){
            System.out.println("Cliente atualizado.");
        }else{
            System.out.println("Não cadastrado.");
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID");
        int id = scanner.nextInt();
        boolean clienteEncontrado = false;
        for(Cliente cliente : this.getClientes()){
            if(cliente.getId() == id){
                clienteEncontrado = true;
                this.getClientes().remove(cliente);
                System.out.println("Cliente removido.");
                System.out.println(getClientes());
                break;
            }
        }
        if (!clienteEncontrado){
            System.out.println("Não cadastrado.");
        }

    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
