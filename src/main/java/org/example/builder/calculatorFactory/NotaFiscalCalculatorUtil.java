package org.example.builder.calculatorFactory;

import org.example.builder.model.Item;

import java.math.BigDecimal;
import java.util.List;

public class NotaFiscalCalculatorUtil {

    public BigDecimal sumItemValue(List<Item> itens){
        return itens.stream()
                .map(Item::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
