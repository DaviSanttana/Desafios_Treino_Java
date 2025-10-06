package ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.SistemaPagamento;

import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.repositorio.GatewayDePagamento;
import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.servico.BoletoGateway;
import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.servico.CartaodeCreditoGateway;
import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.servico.MeiosDePagamento;
import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.servico.PayPalGateway;

public class PagamentoTest {
    public static void main(String[] args) {
        // Configurando pra usar boletos
        GatewayDePagamento boleto = new BoletoGateway();
        MeiosDePagamento pagamentoBoleto = new MeiosDePagamento(boleto);
        pagamentoBoleto.finalizarPagamento(500); // Ficara pendente ate o pagamento dentro do prazo de 3 dias

        // Configurando pra usar cartão de credito
        GatewayDePagamento cartao = new CartaodeCreditoGateway();
        MeiosDePagamento pagamentoCartao = new MeiosDePagamento(cartao);
        pagamentoCartao.finalizarPagamento(1200); // 70% de ser aprovado por causam do ramdom, para simular uma compra real

        // Configurando pra usar transferência Paypal
        GatewayDePagamento paypal = new PayPalGateway();
        MeiosDePagamento pagamentoPaypal = new MeiosDePagamento(paypal);
        pagamentoPaypal.finalizarPagamento(600); // 60% de ser aprovado por causam do ramdom, para simular uma transferência real
    }
}
