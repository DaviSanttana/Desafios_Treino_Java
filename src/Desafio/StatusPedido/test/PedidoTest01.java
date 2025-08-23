package Desafio.StatusPedido.test;

import Desafio.StatusPedido.dominio.Pedido;
import Desafio.StatusPedido.dominio.StatusPedido;

public class PedidoTest01 {
    public static void main(String[] args) {
        Pedido p1 =  new Pedido(1,"Monitor");
        Pedido p2 =  new Pedido(2,"Notebook");
        Pedido p3 =  new Pedido(3,"Tv");
        Pedido p4 =  new Pedido(4,"PS-5");

        p1.atualizarStatus(StatusPedido.PENDENTE);
        p2.atualizarStatus(StatusPedido.PROCESSANDO);
        p3.atualizarStatus(StatusPedido.ENVIADO);
        p4.atualizarStatus(StatusPedido.ENTREGUE);

     p1.exibirPedido();
     p2.exibirPedido();
     p3.exibirPedido();
     p4.exibirPedido();
    }
}
