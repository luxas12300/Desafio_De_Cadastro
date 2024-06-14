package Models.Financeiro;

import Interface.InterfaceCadastro;

public abstract class Financeiro implements InterfaceCadastro {

    private Integer id;
    private Integer numeroConta;
    private String emissao;
    private String pagamento;
    private Double valor;
    private Double juros;
    private Double multa;
    private Double desconto;
    private Double total;


    @Override
    public void entrar() {
        System.out.println("Valor");
        setValor(scanner.nextDouble());
        System.out.println("Juros");
        setJuros(scanner.nextDouble());
        System.out.println("multa");
        setMulta(scanner.nextDouble());
        System.out.println("Desconto");
        setDesconto(scanner.nextDouble());
        System.out.println("Total = " + calculaTotal(valor,juros,multa,desconto));

    }

    @Override
    public void imprimir() {
        System.out.println("Valor: " + this.getValor());
        System.out.println("Juros: " +this.getJuros());
        System.out.println("Multa: " +this.getMulta());
        System.out.println("Total: " + this.getTotal());
    }

    public double calculaTotal(Double valor,Double Juros,Double multa,Double desconto){
        this.total = valor + (valor * juros/100) + multa - (valor * desconto/100);
        return total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
