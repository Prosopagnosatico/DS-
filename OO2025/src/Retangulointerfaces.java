  class Retangulointerfaces implements Formainterfaces{
    private double largura;
    private double altura;

    public Retangulointerfaces(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
     public double calcularArea(){
        return largura * altura;
    }
}
