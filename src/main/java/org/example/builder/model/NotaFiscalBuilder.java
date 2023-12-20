package org.example.builder.model;

import org.example.builder.calculatorFactory.NotaFiscalCalculator;
import org.example.builder.calculatorFactory.NotaFiscalGatewayParaPessoaFisica;
import org.example.builder.calculatorFactory.NotaFiscalGatewayParaPessoaJuridica;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class NotaFiscalBuilder {
    private NotaFiscal notaFiscal;

    public NotaFiscalBuilder(){
        this.notaFiscal = new NotaFiscal();
    }

    public NotaFiscalBuilder codigo(Long codigo){
        this.notaFiscal.setCodigo(codigo);
        return this;
    }

    public NotaFiscalBuilder data(OffsetDateTime data){
        this.notaFiscal.setDataEmissao(data);
        return this;
    }

    public NotaFiscalBuilder item(Item item){
        this.notaFiscal.addItem(item);
        return this;
    }

    public NotaFiscalBuilder itens(List<Item> itens){
        this.notaFiscal.setItens(itens);
        return this;
    }

    public NotaFiscalBuilder calcularPessoaFisica(){
        NotaFiscalCalculator notaFiscalCalculator =
                new NotaFiscalGatewayParaPessoaFisica();
        BigDecimal valorTotal =
                notaFiscalCalculator.calculate(this.notaFiscal.getItens());
        this.notaFiscal.setValorTotal(valorTotal);
        return this;
    }

    public NotaFiscalBuilder calcularPessoaJuridica(){
        NotaFiscalCalculator notaFiscalCalculator =
                new NotaFiscalGatewayParaPessoaJuridica();

        this.notaFiscal.setValorTotal(
                notaFiscalCalculator
                        .calculate(this.notaFiscal.getItens())
        );
        return this;
    }

    public NotaFiscal build(){
        return this.notaFiscal;
    }
}
