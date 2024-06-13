package operacoesbasicas.ordenarlist;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class OrdenacaoPessoa {
    
    //atributo
    private List<Pessoa> pessoaList;

     public OrdenacaoPessoa (){
        this.pessoaList = new ArrayList<>();
     }
public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
}
public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    //o método sort irá entender que ele precisa ordenar a lista através do comparable
    return pessoasPorIdade;
}

public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Carlos", 20, 1.45);
        ordenacaoPessoa.adicionarPessoa("Ana", 19, 1.95);
        ordenacaoPessoa.adicionarPessoa("João", 18, 1.87);
        ordenacaoPessoa.adicionarPessoa("Victor", 90, 1.20);

        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }
}










 
