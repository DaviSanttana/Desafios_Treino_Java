package Desafio.StatusPedido.dominio;

public enum StatusPedido {
    PENDENTE("Aguardando pagamento"),
    PROCESSANDO("Pedido em processamento"),
    ENVIADO("Pedido enviado"),
    ENTREGUE("Pedido entregue"),
    CANCELADO("Pedido cancelado");

    private  String descricao;
    StatusPedido(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
