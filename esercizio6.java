class Persona {
    String nome;
    int eta;

    Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni.");
    }
}

public class esercizio6 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mario", 25);
        Persona persona2 = new Persona("Lucia", 30);

        persona1.presentati();
        persona2.presentati();
    }
}