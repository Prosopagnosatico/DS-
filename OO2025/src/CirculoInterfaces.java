
class Circulointerfaces implements Formainterfaces{
    private double raio;

    public Circulointerfaces(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}
