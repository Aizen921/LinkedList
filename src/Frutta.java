import java.util.LinkedList;

public class Frutta {
    private String nome;
    private LinkedList<Frutta> listaFrutta = new LinkedList<>();

    public Frutta() {

    }

    public Frutta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Frutta> getListaFrutta() {
        return listaFrutta;
    }

    public void visualizzaInfo() {
        for (Frutta frutto : listaFrutta) {
            System.out.println("Lista Frutta : " + frutto.getNome());
        }
    }
}

