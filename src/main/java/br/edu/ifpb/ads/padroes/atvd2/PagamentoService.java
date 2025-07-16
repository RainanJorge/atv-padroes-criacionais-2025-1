package br.edu.ifpb.ads.padroes.atvd2;

public class PagamentoService {
    private final PagamentoGateway gateway;

    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public void pagar(double valor) {
        if (gateway.processarPagamento(valor)) {
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Falha ao processar pagamento.");
        }
    }
} 