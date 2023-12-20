package org.example.builder.calculatorFactory;

import org.example.builder.model.NotaFiscal;

public class NotaFiscalGatewayParaPessoaJuridica extends NotaFiscalCalculator{

    @Override
    protected NotaFiscalContract calculateNotaFiscal() {
        return new CalcularPessoaJuridica();
    }
}
