package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto : produtos ) {
            System.out.println("Id: " + produto.getId() + " Produto: " + produto.getNome() + " Preço: R$" + produto.getPreco());
        }

        double preçoTotal = produtos.stream()
                .map(p -> p.getPreco())
                .reduce(0.0,(t,p) -> t + p)
                .doubleValue();

        System.out.println("O valor total é R$ " + preçoTotal);

        dao.fechar();
    }
}
