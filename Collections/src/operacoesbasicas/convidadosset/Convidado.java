package operacoesbasicas.convidadosset;

public class Convidado {
    //atributos
    private String nome;
    private int codigoConvite;

public Convidado(String nome, int codigoConvite){
    this.nome = nome;
    this.codigoConvite = codigoConvite;
}
    public String getNome(){
        return nome;
    } 
    public int getCodigoConvite(){
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public String toString() {
        return "Convidado{ " + "nome = " + nome + " código do convite: " + codigoConvite + "}";
    }
    
    
   
}



