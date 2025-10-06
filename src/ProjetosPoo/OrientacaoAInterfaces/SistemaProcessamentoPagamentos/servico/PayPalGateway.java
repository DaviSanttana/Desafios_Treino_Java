package ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.servico;
import ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.repositorio.GatewayDePagamento;

public class PayPalGateway implements GatewayDePagamento {
    @Override
    public VericarStatus processarPagamento(double valor) {
        System.out.println("\nProcessando pagamento via transferencia paypal no valor de R$ " + valor);
        java.util.Random random = new java.util.Random();
        double chanceAprovado = random.nextDouble();

        //60% de ser aprovado
        if (chanceAprovado <= 0.60) {
            System.out.println("Transação aprovada");
            return VericarStatus.APROVADO;
        } else {
            System.out.println("Transação negada por risco");
            return VericarStatus.NEGADO;
        }
    }
}