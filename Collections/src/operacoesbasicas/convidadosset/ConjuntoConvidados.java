package operacoesbasicas.convidadosset;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados{
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
       convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    //System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(s) dentro do set de convidados");

    conjuntoConvidados.adicionarConvidado("Camilla", 1);
    conjuntoConvidados.adicionarConvidado("Carlos", 2);
    conjuntoConvidados.adicionarConvidado("Eu", 3);
    conjuntoConvidados.adicionarConvidado("Pedro", 2);

    //System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de convidados");

    conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
    System.out.println("Existem atualmente " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");

    conjuntoConvidados.exibirConvidados();
}

}