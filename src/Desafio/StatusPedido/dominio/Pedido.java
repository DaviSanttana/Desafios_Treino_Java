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

    public void exibirPedido(){
        System.out.println("Pedido #"+ id);
        System.out.println("Produtos: "+ descricao);
        System.out.println("Status: "+status+ " - "+status.getDescricao()+"-  codDesricao: "+status.getCodDesricao());
        System.out.println();
    }
    public int getId() {
        return id;
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
