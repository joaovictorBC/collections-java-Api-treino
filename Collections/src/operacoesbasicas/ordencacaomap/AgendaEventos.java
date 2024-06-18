package operacoesbasicas.ordencacaomap;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;



public class AgendaEventos {
    public Map<LocalDate, Evento> eventosMap;


    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento (LocalDate date, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(date, evento);
    } 
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);

    }
    public void obterProximoEvento(){
        //como quero pegar uma determinada data e retornar um evento, não posso utilizar esses métodos
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();
        eventosMap.get(values)*/
        //o método acima não funciona pois não tenho as chaves dos eventos futuros
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        //só foi possível por conta do TreeMap estar organizado em ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        //o método entrySet retorna um Set e esse Set vão ter objetos do tipo Map.Entry esse sabe apontar a chave e o valor correspondente, diferentemente do KeySet() e values().
        //o var nao obriga a declarar o tipo da variável
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento é: " + proximoEvento + "acontecerá na data: " + proximaData);
                break;
            }
        }

    }
    public static void main(String [] args){
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 17), "Aniversário Priscilla", "Evento 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 17), "casamento Priscilla", "Evento 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 20), "Hospital Priscilla", "Evento 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
