package ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.servico;
import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.repositorio.GatewayDePagamento;

public class BoletoGateway implements GatewayDePagamento {
    @Override
    public VericarStatus processarPagamento(double valor) {
        System.out.println("Boleto Gerado com sucesso no valor de "+valor);
        System.out.println(" O cliente tem 3 dias para pagar");
        return VericarStatus.PENDENTE;
    }
}
