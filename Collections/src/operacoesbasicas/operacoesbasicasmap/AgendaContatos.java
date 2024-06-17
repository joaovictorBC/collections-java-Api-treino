package operacoesbasicas.operacoesbasicasmap;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos{
    //o map recebe uma chave e um valor, por isso a String como chave (nome dos contatos) e o valor como Integer (número dos contatos) (wrap do int)
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos (){
        this.agendaContatoMap = new HashMap<>();
    }
    //Hashmap é o mais utilizado
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    //com list e set, realizar a verificação se a lista está vazia
        public void removerContato(String nome){
            if(!agendaContatoMap.isEmpty()){
                agendaContatoMap.remove(nome);
            }
        }
        public void exibirContatos(){
            System.out.println(agendaContatoMap);
        }
        public Integer pesquisarPorNome(String nome){
            Integer numeroPorNome = null;
            if (!agendaContatoMap.isEmpty()){
                numeroPorNome = agendaContatoMap.get(nome);
            }
            return numeroPorNome;
        }
        public static void main(String[] args) {
            AgendaContatos agendaContatos = new AgendaContatos();

            agendaContatos.adicionarContato("Jones", 12345);
            agendaContatos.adicionarContato("Jones", 1234523);
            agendaContatos.adicionarContato("Maria", 1245);
            agendaContatos.adicionarContato("Ana", 1234);
            agendaContatos.adicionarContato("José", 2345);

            //agendaContatos.exibirContatos();

           //agendaContatos.removerContato("José");

            //agendaContatos.exibirContatos();

           System.out.println("o número é: " + agendaContatos.pesquisarPorNome("José"));

        }
    }
