package Models;

import Models.Pessoa.Endereco;

import java.util.ArrayList;

public class Cliente extends PessoaJuridica{
        private Double limiteCredito;
        private Endereco enderecoCobranca;



        public void entrar(){
            super.entrar();
            System.out.println("Digite o limite de crédito. (Apenas números)");
            this.setLimiteCredito(scanner.nextDouble());
            Endereco enderecoCobranca = new Endereco();
            System.out.println("Cadastre o endereço de cobrança");
            enderecoCobranca.entrar();
            this.setEnderecoCobranca(enderecoCobranca);
        }
        public void imprimir(){
            super.imprimir();
            enderecoCobranca.imprimir();
            System.out.println("Limite de crédito: " + this.getLimiteCredito());
        }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Endereco getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(Endereco enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }
}
