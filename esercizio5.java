public class esercizio5 {
    private String nome;
    private int eta;

    public esercizio5(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }

    public static void main(String[] args) {
        esercizio5 persona1 = new esercizio5("Marco", 30);
        persona1.presentati();
    }
}
