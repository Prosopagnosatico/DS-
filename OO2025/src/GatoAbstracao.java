public class GatoAbstracao extends AnimalAbstracao{
    public GatoAbstracao(String nome){
            //super pega atributos de outra classe
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Miau, miau!");
        }
    }


