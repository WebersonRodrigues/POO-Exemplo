package src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

import src.util.UtilData;

public class ContaBancaria {
    
    private String agencia;
    private String conta;
    private Integer digito;
    // Tipo de conta ???
    private Double saldo;
    private ArrayList<Movimentacao> movimentacoes;


    
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;

        // Instancio o array de movimentações.
        this.movimentacoes = new ArrayList<Movimentacao>();

        // Crio uma movimentação para a abertura de conta.
        Movimentacao movimentacao = new Movimentacao(new Date(), saldoInicial, ETipoMovimentacao.ABERTURA_DE_CONTA);

        // Adiciono a primeira movimentação no meu array de movimentações.
        this.movimentacoes.add(movimentacao);
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }


    public Double sacar(Double valor){

        if(valor > this.saldo){
            throw new InputMismatchException("Saldo insulficiente.");
        }

        this.saldo -= valor;

        Movimentacao movimentacao = new Movimentacao(new Date(), valor, ETipoMovimentacao.SAQUE);
        this.movimentacoes.add(movimentacao);

        return valor;
    }
  

    public void imprimirExtrato(){

        System.out.println("*********************************");
        System.out.println("******* Extrato Bancário ********");
        System.out.println("*********************************");
        System.out.println();

        System.out.println("Gerado em: " + UtilData.converterDateParaData(new Date()));
        System.out.println();

        for(Movimentacao movimentacao : this.movimentacoes){
            System.out.println(movimentacao);
        }

        System.out.println();
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println();


    }


}
