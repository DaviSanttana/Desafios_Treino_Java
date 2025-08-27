package Desafio.StatusPedido.dominio;

public enum StatusPedido {
    PENDENTE("Aguardando pagamento",001),
    PROCESSANDO("Pedido em processamento",002),
    ENVIADO("Pedido enviado",003),
    ENTREGUE("Pedido entregue",004),
    CANCELADO("Pedido cancelado",005);

    private  String descricao;
    private  int codDesricao;
    StatusPedido(String descricao, int codDesricao){
        this.descricao = descricao;
        this.codDesricao = codDesricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public int getCodDesricao() {
        return codDesricao;
    }
}
