package Models.Controllers;

import Models.Cliente;
import Models.Financeiro.ContasAPagar;

import java.util.ArrayList;
import java.util.Scanner;

public class ContasAPagarController implements InterfaceCRUD{
    private ArrayList<ContasAPagar> contasAPagar = new ArrayList<>();

    @Override
    public void create() {
        ContasAPagar contasAPagar1 = new ContasAPagar();
        contasAPagar1.entrar();
        boolean contaExiste = false;
        for (ContasAPagar contasAPagar : getContasAPagar()){
            if((contasAPagar.getBoleto() == contasAPagar1.getBoleto()) || (contasAPagar.getId() == contasAPagar1.getId())){
                System.out.println("Boleto já existente");
                break;
            }
        }
        if (contaExiste == false) {
            this.getContasAPagar().add(contasAPagar1);
            System.out.println("Conta a pagar cadastrada.");
            System.out.println(getContasAPagar());
        }
    }

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do boleto");
        int buscaBoleto = scanner.nextInt();
        boolean contaEncontrada = false;
        for(ContasAPagar contasAPagar1 : this.getContasAPagar()){
            if(contasAPagar1.getBoleto() == buscaBoleto){
                contaEncontrada = true;
                contasAPagar1.imprimir();
                break;
            }
        }
        if (!contaEncontrada){
            System.out.println("Não cadastrada.");
        }

    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        boolean contaEncontrada = false;
        int index = 0;
        for(ContasAPagar contasAPagar1 : this.getContasAPagar()){
            if(contasAPagar1.getId() == id){
                ContasAPagar novaContaAPAgar = new ContasAPagar();
                contaEncontrada = true;
                novaContaAPAgar.entrar();
                getContasAPagar().remove(contasAPagar1);
                getContasAPagar().add(index, novaContaAPAgar);
                break;
            }
            index++;
        }
        if (contaEncontrada){
            System.out.println("Conta atualizada.");
        }else{
            System.out.println("Não cadastrada.");
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        Integer id = scanner.nextInt();
        boolean contaEncontrada = false;
        for(ContasAPagar contasAPagar1 : this.getContasAPagar()){
            if(contasAPagar1.getId() == id){
                contaEncontrada = true;
                this.getContasAPagar().remove(contasAPagar1);
                break;
            }
        }
        if (contaEncontrada){
            System.out.println("Conta removida.");
        }else{
            System.out.println("Não cadastrada.");
        }

    }

    public ArrayList<ContasAPagar> getContasAPagar() {
        return contasAPagar;
    }

    public void setContasAPagar(ArrayList<ContasAPagar> contasAPagar) {
        this.contasAPagar = contasAPagar;
    }
}
