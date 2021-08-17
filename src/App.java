package src;

import java.text.SimpleDateFormat;
import java.util.Date;

import src.model.ContaBancaria;
import src.model.ETipoMovimentacao;
import src.model.Movimentacao;
import src.util.UtilData;

public class App {
    public static void main(String[] args) {
        System.out.println("Aprendendo POO");

        // Movimentacao m = new Movimentacao();

        // m.setTipo(ETipoMovimentacao.ABERTURA_DE_CONTA);
        // m.setData(new Date());
        // m.setValor(100.0);
        // System.out.println(m.toString());

        System.out.println();

        var data = new Date();


        var resultado1  = UtilData.converterDateParaData(data);
        var resultado2  = UtilData.converterDateParaHora(data);
        var resultado3  = UtilData.converterDateParaDataEHora(data);

        // SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        // var minhaData = formatador.parse(resultado1);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);

        ContaBancaria conta = new ContaBancaria("0001", "7542", 5, 1000.0);
        conta.sacar(300.0);

        conta.imprimirExtrato();
    }
}