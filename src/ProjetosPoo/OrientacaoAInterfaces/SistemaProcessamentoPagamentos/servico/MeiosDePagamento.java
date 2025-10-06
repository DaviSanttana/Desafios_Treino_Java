package ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.servico;
import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.repositorio.GatewayDePagamento;

public class MeiosDePagamento {
    private GatewayDePagamento metodo;

    public MeiosDePagamento(GatewayDePagamento metodo) {
        this.metodo = metodo;
    }

    public void finalizarPagamento(double valor) {
        GatewayDePagamento.VericarStatus statusPedido = this.metodo.processarPagamento(valor);
        switch (statusPedido){
            case APROVADO ->
                System.out.println("Pagamento Aprovado");
            case PENDENTE ->
                System.out.println("Aguardando pagamento");
            case NEGADO ->
                    System.out.println("Erro no pagamento");
        }
    }

}
