public class Pessoa extends Animal {
    //atributos
    String sobrenome;
    // métodos
    public void falar(){
        System.out.println("falar");
    }
    public String falar(String volume) {
        return "falei " + volume;
    }//Construtor
        Pessoa() {


        }
        Pessoa(String _nome){
        this.nome = _nome;
        }
    public  void  comer() {
        System.out.println("Pessoa Comeu!!!");
    }}

