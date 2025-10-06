package ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.servico;
import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.repositorio.GatewayDePagamento;

public class BoletoGateway implements GatewayDePagamento {
    @Override
    public VericarStatus processarPagamento(double valor) {
        System.out.println("\nBoleto Gerado com sucesso no valor de R$ "+valor);
        System.out.println("O cliente tem 3 dias para  efetuar o  pagameto do boleto");
        return VericarStatus.PENDENTE;
    }
}
