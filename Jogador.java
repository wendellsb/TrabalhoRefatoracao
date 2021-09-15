import java.util.ArrayList;
public class Jogador {
    //atributos
    private static ArrayList<String> ListaJogadores = new ArrayList<String> ();
    private String nomeJog;
    private String timeName;
    //metodos
    public String getNomeJogaString(){
        return nomeJog;
    }

    public static ArrayList<String> getListaJogador(){
        return ListaJogadores;
    }
    public String getTime(){
        return timeName;
    }
    public void setNomeJogador(String nomejog){
        this.nomeJog = nomejog;
        if(ListaJogadores.size() < 5){
            ListaJogadores.add(nomejog);
        }
        else{
            System.out.println("Chegou ao máximo!");
        }
    }
    public void setTime(String time){
        this.timeName = time;
    }
}