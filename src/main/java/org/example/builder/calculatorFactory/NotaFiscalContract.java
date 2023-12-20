package org.example.builder.calculatorFactory;

import org.example.builder.model.Item;
import org.example.builder.model.NotaFiscal;

import java.math.BigDecimal;
import java.util.List;

public interface NotaFiscalContract{
    BigDecimal calcularImposto(List<Item> itens);
}
