package ProjetosPoo.OrientacaoAInterfaces.SistemaProcessamentoPagamentos.repositorio;

public interface GatewayDePagamento {
    public enum VericarStatus{
        APROVADO,
        NEGADO,
        PENDENTE;
    }
    VericarStatus processarPagamento(double valor);
}
