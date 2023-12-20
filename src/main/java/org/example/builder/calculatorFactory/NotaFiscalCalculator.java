package org.example.builder.calculatorFactory;

import org.example.builder.model.Item;
import org.example.builder.model.NotaFiscal;

import java.math.BigDecimal;
import java.util.List;

public abstract class NotaFiscalCalculator{
    protected abstract NotaFiscalContract calculateNotaFiscal();

    public BigDecimal calculate(List<Item> itens){
        return calculateNotaFiscal().calcularImposto(itens);
    }
}
