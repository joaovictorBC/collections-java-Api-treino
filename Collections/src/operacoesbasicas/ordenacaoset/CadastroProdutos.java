package operacoesbasicas.ordenacaoset;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos{
    //atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    } 
    public void adicionarProdutos(long cod, String nome, double valor, int quantidade){
        produtoSet.add(new Produto(cod, nome, valor, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
 public static void main(String[] args) {
     CadastroProdutos cadastroProdutos = new CadastroProdutos();

     cadastroProdutos.adicionarProdutos(123L, "Banana", 10d , 20);
     cadastroProdutos.adicionarProdutos(145L, "Maçã", 12d , 50);
     cadastroProdutos.adicionarProdutos(123L, "Pêra", 16d , 40);
     cadastroProdutos.adicionarProdutos(189L, "Uva", 17d , 21);

     //System.out.println(cadastroProdutos.produtoSet);
     
     //System.out.println(cadastroProdutos.exibirProdutosPorNome());
     System.out.println(cadastroProdutos.exibirProdutosPorPreco());

 }
}