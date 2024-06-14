package operacoesbasicas.pesquisarset;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContatos(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    //método para mostrar outros contatos com mesmo nome inicial, mas diferentes sobrenomes
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        } return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("Camilla", 123456789);
        agendaContatos.adicionarContatos("João", 1234589);
        agendaContatos.adicionarContatos("Pedro", 987654321);
        agendaContatos.adicionarContatos("Camilla Pedro", 123489);
        agendaContatos.adicionarContatos("Camilla Pereira", 123489);

       agendaContatos.exibirContatos();

        //System.out.println(agendaContatos.pesquisarPorNome("Camilla"));

        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("Camilla Pereira", 123));
    }
}
