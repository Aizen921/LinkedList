public class Main {
    public static void main(String[]args){
    Frutta frutti = new Frutta();
    frutti.getListaFrutta().add(new Frutta("Fragola"));
    frutti.getListaFrutta().add(new Frutta("Ciliegia"));
    frutti.getListaFrutta().add(new Frutta("Lampone"));
    frutti.getListaFrutta().add(new Frutta("Banana"));
    frutti.visualizzaInfo();
    frutti.getListaFrutta().addFirst(new Frutta("Ananas"));
    frutti.getListaFrutta().addLast(new Frutta("Mela"));
    System.out.println("Lista con elementi aggiunti");
    frutti.visualizzaInfo();



    }
}
