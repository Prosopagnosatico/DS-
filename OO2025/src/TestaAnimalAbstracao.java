public class TestaAnimalAbstracao {
    public static void main(String[] args){
        AnimalAbstracao cachorro = new CachorroAbstracao("Bily");
        AnimalAbstracao gato = new GatoAbstracao("Bibi");

        cachorro.emitirSom();//Au, au!
        gato.emitirSom();//Miau, miau!
    }
}
