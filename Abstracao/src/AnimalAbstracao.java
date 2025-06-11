import org.w3c.dom.ls.LSOutput;

abstract class AnimalAbstracao {
    private String nome;

    public AnimalAbstracao(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public abstract void emitirSom();
}

