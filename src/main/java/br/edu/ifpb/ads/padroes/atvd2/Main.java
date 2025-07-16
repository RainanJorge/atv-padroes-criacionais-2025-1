package br.edu.ifpb.ads.padroes.atvd2;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

public class Main {
    public static void main(String[] args) {
        // Exemplo com PayPal
        MutablePicoContainer containerPayPal = new DefaultPicoContainer();
        containerPayPal.addComponent(PagamentoGateway.class, new PagamentoGateway() {
            @Override
            public boolean processarPagamento(double valor) {
                System.out.println("[PayPal] Pagamento de R$" + valor + " realizado com sucesso!");
                return true;
            }
        });
        containerPayPal.addComponent(PagamentoService.class);
        PagamentoService pagamentoServicePayPal = containerPayPal.getComponent(PagamentoService.class);
        pagamentoServicePayPal.pagar(100.0);

        // Exemplo com Stripe
        MutablePicoContainer containerStripe = new DefaultPicoContainer();
        containerStripe.addComponent(PagamentoGateway.class, new PagamentoGateway() {
            @Override
            public boolean processarPagamento(double valor) {
                System.out.println("[Stripe] Pagamento de R$" + valor + " realizado com sucesso!");
                return true;
            }
        });
        containerStripe.addComponent(PagamentoService.class);
        PagamentoService pagamentoServiceStripe = containerStripe.getComponent(PagamentoService.class);
        pagamentoServiceStripe.pagar(200.0);

        // Exemplo com PagSeguro
        MutablePicoContainer containerPagSeguro = new DefaultPicoContainer();
        containerPagSeguro.addComponent(PagamentoGateway.class, new PagamentoGateway() {
            @Override
            public boolean processarPagamento(double valor) {
                System.out.println("[PagSeguro] Pagamento de R$" + valor + " realizado com sucesso!");
                return true;
            }
        });
        containerPagSeguro.addComponent(PagamentoService.class);
        PagamentoService pagamentoServicePagSeguro = containerPagSeguro.getComponent(PagamentoService.class);
        pagamentoServicePagSeguro.pagar(300.0);
    }
} 
