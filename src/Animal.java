public class Animal {
 // Atributos
    String nome;
    String raca;
    private double peso;
    String tipoPelo;
    String corOlhoDireito;
    // Getter e Setter
    public void  setPeso(String chave,double peso) {
        if (chave.equals("AD")) {
            this.peso = peso;
        }
    }
    public Double getPeso();{
        return peso;
    }
// mais sobre cargas do construHYYHwyhqtvb56tor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Métodos-comportamento
    public  void  andar(){

        System.out.println("andou");
    }
    public  void  comer(){
        System.out.println("Animal Comeu!!!");}
// Construtor padrão
        Animal(){

    }
    // Sobrecarga do construtor
    Animal(String raca){
        this.raca = raca;
    }
}
