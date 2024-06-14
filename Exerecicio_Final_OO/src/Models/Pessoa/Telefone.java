package Models.Pessoa;

import java.util.Scanner;

public class Telefone {
    private int ddd;
    private int numero;

    public void entrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o DDD: (Apenas números)");
        this.setDdd(scanner.nextInt());
        System.out.println("Digite o número de telefone: (Apenas números)");
        this.setNumero(scanner.nextInt());
    }

    public void imprimir(){
        System.out.println("O DDD é: "+ this.getDdd());
        System.out.println("O número de telefone é: " + this.getNumero());
    }

    public Telefone(){}

    public Telefone(int ddd, int numero){
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
