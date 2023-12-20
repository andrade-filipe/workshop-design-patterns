package org.example.builder;

import org.example.builder.model.Item;
import org.example.builder.model.NotaFiscal;

import java.time.OffsetDateTime;

public class Example {
    Item item = new Item.ItemBuilder()
            .descricao("Mouse")
            .quantidade(2)
            .valor("100.00")
            .build();

    NotaFiscal notaFiscal = new NotaFiscalBuilder()
            .codigo(1L)
            .data(OffsetDateTime.now())
            .item(item)
            .calcularPessoaJuridica()
            .build();

    public void printNota(){
        System.out.println(notaFiscal);
    }
}
