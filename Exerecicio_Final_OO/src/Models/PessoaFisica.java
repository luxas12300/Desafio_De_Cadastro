package Models;

import Models.Pessoa.Pessoa;

public abstract class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;
    private String emissor;
    private Funcionario funcionario;

    @Override
    public void entrar(){

        super.entrar();
        System.out.println("Digite o CPF");
        this.setCpf(scanner.nextLine());
        System.out.println("Digite o RG");
        this.setRg(scanner.nextLine());
        System.out.println("Digite o emissor");
        this.setEmissor(scanner.nextLine());
    }

    @Override
    public void imprimir(){

        super.imprimir();
        System.out.println("CPF: " + this.getCpf());
        System.out.println("RG: " + this.getRg());
        System.out.println("Emissor: " + this.getEmissor());
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
