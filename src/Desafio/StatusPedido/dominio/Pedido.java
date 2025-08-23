package Desafio.StatusPedido.dominio;

public class Pedido {
    public static void main(String[] args) {

    }
    private int id;
    private String descricao;
    private StatusPedido status;

    public Pedido(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.status = StatusPedido.PENDENTE;
    }
     public  void atualizarStatus(StatusPedido novoStatus){
        this.status = novoStatus;
     }

    @Override
    public String toString() {
        return "Pedido #1 " + id + " |  Produto: " + descricao + " |  Status=" + status +" - "+ status.getDescricao();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }
}
