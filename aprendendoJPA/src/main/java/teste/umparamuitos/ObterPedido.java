package teste.umparamuitos;

import infra.DAO;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
        DAO< Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1);

        for (ItemPedido itemPedido: pedido.getItens() ) {
            System.out.println(itemPedido.getQuantidade());
            System.out.println(itemPedido.getProduto().getNome());

        }
        dao.fechar();

    }
}
