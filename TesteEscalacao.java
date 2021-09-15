public class TesteEscalacao {
    public static void main(String[] args){
        Time time = new Time();
        time.setTimeNome("PSG");
        
        Jogador jogador1 = new Jogador();    
        jogador1.setNomeJogador("Wendell Santos");;
        jogador1.setTime(Time.getNome());

        Jogador jogador2 = new Jogador();
        jogador2.setNomeJogador("Marcelo Barbosa");
        jogador2.setTime(Time.getNome());

        Jogador jogador3 = new Jogador();
        jogador3.setNomeJogador("Carlos Oliveira");
        jogador3.setTime(Time.getNome());

        Jogador jogador4 = new Jogador();
        jogador4.setNomeJogador("Nathan Barbosa");
        jogador4.setTime(Time.getNome());

        Jogador jogador5 = new Jogador();
        jogador5.setNomeJogador("Marcio Alex");
        jogador5.setTime(Time.getNome());

        Escalacao.imprimirEscalacao();
    }
}