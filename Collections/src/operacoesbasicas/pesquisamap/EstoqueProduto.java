package operacoesbasicas.pesquisamap;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto(){
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calculaValorTotal(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    } 
    //contando q os produtos têm valores diferentes
     //o método min value é para pegar o menor valor
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
       
        if(!estoqueProdutosMap.isEmpty()){
        for (Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
        } return produtoMaisCaro;
    }
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.adicionarProduto(1L, "banana", 1, 4.34);
        estoqueProduto.adicionarProduto(2L, "maçã", 2, 32.3);
        estoqueProduto.adicionarProduto(3L, "pêra", 3, 234.98);

        estoqueProduto.exibirProdutos();

        System.out.println("O estoque vale ao todo: " + estoqueProduto.calculaValorTotal());

        System.out.println("O produto mais caro custa: " + estoqueProduto.obterProdutoMaisCaro());
    }
}
