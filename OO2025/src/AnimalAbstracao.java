//Classe abstrata AnimalAbstracao
abstract class AnimalAbstracao{
    private String nome;

    //Esse método instancia(tranforma em objeto) nome
    public AnimalAbstracao(String nome){
        this.nome = nome;
    }

    /*Esse método te pede para colocar um valor dentro de nome, e esse valor vai ser
    registrado na variavel nome, tu vai colocar um valo dentro da variavel rosa,
    e esse valor vai ser posto dentro da variavel nome do metodo construtor*/
    public String getNome(){
        return nome;
    }

    //Método abstrato (sem implementação)
    public abstract void emitirSom();
}


