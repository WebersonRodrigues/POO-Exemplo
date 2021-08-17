package src.model;

import java.util.Date;

import src.util.UtilData;

public class Movimentacao {

    private Date data;

    private Double valor;

    private ETipoMovimentacao tipo;

    public Movimentacao(Date data, Double valor, ETipoMovimentacao tipo) {
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ETipoMovimentacao getTipo() {
        return tipo;
    }

    public void setTipo(ETipoMovimentacao tipo) {
        this.tipo = tipo;
    }    

    @Override
    public String toString(){
        String dataEHora = UtilData.converterDateParaDataEHora(this.data);
        return String.format("%s - (%s) - R$%s", dataEHora, this.tipo, this.valor);
    }
}
