package ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.servico;
import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.repositorio.GatewayDePagamento;

public class CartaodeCreditoGateway implements GatewayDePagamento {
    @Override
    public VericarStatus processarPagamento(double valor) {
        System.out.println("\nProcessando requisição de R$ " + valor + " junto à operadora de cartão.");
        java.util.Random random = new java.util.Random();
        double chanceAprovado = random.nextDouble();

        //70% aprovado
        if (chanceAprovado <= 0.70){
            System.out.println("Transação aprovada");
            return VericarStatus.APROVADO;
        }else {
            System.out.println("Transação negada por risco");
            return VericarStatus.NEGADO;
        }
    }
}
