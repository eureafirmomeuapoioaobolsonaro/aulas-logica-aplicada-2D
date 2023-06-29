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
        // criar mias objetos
         Animal cao = new Animal();
        Animal gato = new Animal();
        Animal gato2 = new Animal();
        Animal roedor;
        roedor = new Animal();
        Animal x;
        x = new Animal();

       //Consultar dados do objeto cao
        cao.nome ="Pluto";// atribuição
        System.out.println(cao.nome);// consulta
        cao.comer(); //chamado de método
        Pessoa nova = new Pessoa();
        nova.nome="Tina";
        nova.comer();
        // construir objetos
        Semente s1 = new Semente();
        Animal cao1 = new Animal("Pastor");
        Animal gato1 = new Animal("laranja");
        Animal gato3;
        gato3 = new Animal();
        gato3 = new Animal("preto e banco");
        Animal coelho;
        coelho  = new Animal("Roger" , "Rabbit");
    }




}