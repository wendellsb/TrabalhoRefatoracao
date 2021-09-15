import java.util.ArrayList;

public class Escalacao {
public static ArrayList<String> escalacao;
    
public static ArrayList<String> setEscalacao(){
    return Jogador.getListaJogador();
}
public static void imprimirEscalacao(){
        System.out.println("Time: " + Time.getNome());
        System.out.println("Escalação: " + setEscalacao());
    }
}