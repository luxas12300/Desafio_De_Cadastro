package Models.Controllers;

import Models.Cliente;
import Models.Financeiro.ContasAReceber;

import java.util.ArrayList;
import java.util.Scanner;

public class ContasAReceberController implements InterfaceCRUD{
    private ArrayList<ContasAReceber> contasAReceber = new ArrayList<>();

    @Override
    public void create() {
        ContasAReceber contasAReceber1 = new ContasAReceber();
        contasAReceber1.entrar();
        boolean contaAReceberExiste = false;
        for (ContasAReceber contasAReceber2 : getContasAReceber()){
            if ((contasAReceber2.getId() == contasAReceber1.getId()) || (contasAReceber2.getNotaFiscal() == contasAReceber1.getNotaFiscal())){
                System.out.println("Conta já existente");
                contaAReceberExiste = true;
                break;
            }
        }
        if (contaAReceberExiste == false){
            this.getContasAReceber().add(contasAReceber1);
            System.out.println("Conta cadastrada.");
            System.out.println(getContasAReceber());
        }
    }

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da Nota Fiscal");
        int notaFiscal = scanner.nextInt();
        boolean contaEncontrada = false;
        for(ContasAReceber contasAReceber1 : this.getContasAReceber()){
            if(contasAReceber1.getNotaFiscal() == notaFiscal){
                contaEncontrada = true;
                contasAReceber1.imprimir();
                break;
            }
        }
        if (!contaEncontrada){
            System.out.println("Não cadastrado.");
        }

    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        boolean contaEncontrada = false;
        int index = 0;
        for(ContasAReceber contasAReceber1 : this.getContasAReceber()){

            if(contasAReceber1.getId() == id){
                ContasAReceber contasAReceber2 = new ContasAReceber();
                contaEncontrada = true;
                contasAReceber2.entrar();
                contasAReceber.remove(contasAReceber1);
                contasAReceber.add(index, contasAReceber2);
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
        for(ContasAReceber contasAReceber1 : this.getContasAReceber()){
            if(contasAReceber1.getId() == id){
                contaEncontrada = true;
                this.getContasAReceber().remove(contasAReceber1);
                break;
            }
        }
        if (contaEncontrada){
            System.out.println("Conta removida.");
        }else{
            System.out.println("Não cadastrada.");
        }

    }

    public ArrayList<ContasAReceber> getContasAReceber() {
        return contasAReceber;
    }

    public void setContasAReceber(ArrayList<ContasAReceber> contasAReceber) {
        this.contasAReceber = contasAReceber;
    }
}
