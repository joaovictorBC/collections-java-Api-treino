package operacoesbasicas.pesquisalist;
import java.util.List;
import java.util.ArrayList;

public class CatalogoLivro {
    //atributo
    private List<Livro> livroslist;

    public CatalogoLivro(){
        this.livroslist = new ArrayList<>() ;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroslist.add(new Livro(titulo,autor,anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroslist.isEmpty()){
            for( Livro l : livroslist){
            if(l.getAutor().equalsIgnoreCase(autor));
            livrosPorAutor.add(l);
        }
    } return livrosPorAutor;
} 

public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloAno = new ArrayList<>();
    if(!livroslist.isEmpty()) {
        for (Livro l : livroslist){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                livrosPorIntervaloAno.add(l);
            }
        }
    } return livrosPorIntervaloAno;
}
public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if(!livroslist.isEmpty()){
        for(Livro l : livroslist){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
                //encontrou o primeiro livro, acaba o laço
            }
        }
    } return livroPorTitulo;

}
public static void main(String[] args) {
    CatalogoLivro catalogoDeLivro = new CatalogoLivro();
    catalogoDeLivro.adicionarLivro("Jujutsu Kaisen", "Gege Akutami", 2018);
    catalogoDeLivro.adicionarLivro("Jujutsu Kaisen", "Gege Akutami", 2019);
    catalogoDeLivro.adicionarLivro("Naruto", "Luila", 2017);
    catalogoDeLivro.adicionarLivro("Konosuba", "Akira Toriyama", 2004);
    catalogoDeLivro.adicionarLivro("Sou Sou no Frieren", "Gwen", 2017);

  //System.out.println(catalogoDeLivro.pesquisarPorAutor("Gwen"));
  //System.out.println(catalogoDeLivro.pesquisarPorIntervaloAnos(2004, 2017));
  System.out.println(catalogoDeLivro.pesquisarPorTitulo("Jujutsu Kaisen"));


}
}
