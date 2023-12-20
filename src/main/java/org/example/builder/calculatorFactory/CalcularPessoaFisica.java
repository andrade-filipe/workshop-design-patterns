package org.example.builder.calculatorFactory;

import org.example.builder.model.Item;

import java.math.BigDecimal;
import java.util.List;

public class CalcularPessoaFisica implements NotaFiscalContract{

    public static final double PORCENTAGEM_IMPOSTO = 1.07;

    private NotaFiscalCalculatorUtil util = new NotaFiscalCalculatorUtil();

    @Override
    public BigDecimal calcularImposto(List<Item> itens) {
        return util.sumItemValue(itens).multiply(BigDecimal.valueOf(PORCENTAGEM_IMPOSTO));
    }
}