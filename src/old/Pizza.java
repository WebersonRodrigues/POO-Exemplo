package src.old;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    //#region Atributos
    private String descricao;
    private Integer tamanho;
    private Boolean comBorda;
    private Double valor;
    private ArrayList<String> ingredientes;
    //#endregion
    
    //#region Construtores
    public Pizza(String descricao, Integer tamanho, Boolean comBorda, Double valor) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.comBorda = comBorda;
        this.valor = valor;
    }
    public Pizza() {}
    //#endregion

    //#region Getters e Setters
    public Integer getTamanho() {
        // Eu faço oque eu quiser.
        return tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTamanho(Integer tamanho) {

        this.tamanho = tamanho;
    }

    public Boolean getComBorda() {
        return comBorda;
    }

    public void setComBorda(Boolean comBorda) {
        this.comBorda = comBorda;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    //#endregion
    
    //#region Metodos 

    public void removerIngrediente(String ingrediente){
        // Aqui tenho que ir na lista e remnover o ingrediente.
    }

    public void removerIngrediente(List<String> ingrediente){
        // Aqui tenho que ir na lista e remnover o ingrediente.
    }
 

    //#endregion

}
