public class Main {
    public static void main(String[] args) {
    Pessoa adao = new Pessoa();
    //declaração
    Pessoa qualquer;
    // Instanciação
    qualquer = new Pessoa();
    // Definir forma do objeto
        qualquer.nome = "Rita";
      qualquer.sobrenome = "lee";
      // Defirnir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("alto"));
    }
}