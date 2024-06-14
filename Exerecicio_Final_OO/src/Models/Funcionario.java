package Models;

import Models.PessoaFisica;

public class Funcionario extends PessoaFisica {
    private String dataAdmissao;
    private String dataDemissao;
    private String ctps;

    public void entrar(){

        super.entrar();
        System.out.println("Digite a data de admissão:");
        setDataAdmissao(scanner.nextLine());
        System.out.println("Digite a data de Demissão:");
        setDataDemissao(scanner.nextLine());
        System.out.println("Digite a ctps");
        setCtps(scanner.nextLine());
    }

    public void imprimir(){

        super.imprimir();
        System.out.println("Data de admissão: " + this.getDataAdmissao());
        System.out.println("Data de demissão: " + this.getDataDemissao());
        System.out.println("CTPS: " + this.getCtps());

    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
}
