public class CachorroAbstracao extends AnimalAbstracao{
        public CachorroAbstracao(String nome){
            //super pega atributos de outra classe
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Au, au!");
        }
    }
