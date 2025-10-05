package ProjetosPoo.OrientaçãoAInterfaces.SistemaProcessamentoPagamentos.repositorio;

public interface GatewayDePagamento {
    public enum VericarStatus{
        APROVADO,
        NEGADO,
        PENDENTE;
    }
    VericarStatus processarPagamento(double valor);
}
