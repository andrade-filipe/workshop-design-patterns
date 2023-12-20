package org.example.builder.calculatorFactory;

public class NotaFiscalGatewayParaPessoaFisica extends NotaFiscalCalculator{

    @Override
    protected NotaFiscalContract calculateNotaFiscal() {
        return new CalcularPessoaFisica();
    }
}
