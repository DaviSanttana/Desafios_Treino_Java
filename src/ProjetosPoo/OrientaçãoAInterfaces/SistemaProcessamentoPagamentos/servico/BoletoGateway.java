package ProjetosPoo.OrientaçãoAInterfaces.SistemaProcessamentoPagamentos.servico;
import ProjetosPoo.OrientaçãoAInterfaces.SistemaProcessamentoPagamentos.repositorio.GatewayDePagamento;
import ProjetosPoo.OrientaçãoAInterfaces.SistemaProcessamentoPagamentos.repositorio.GatewayDePagamento.VericarStatus;

public class BoletoGateway implements GatewayDePagamento {
    @Override
    public VericarStatus processarPagamento(double valor) {
        System.out.println("Boleto Gerado com sucesso no valor de "+valor);
        System.out.println(" O cliente tem 3 dias para pagar");
        return VericarStatus.PENDENTE;
    }
}
