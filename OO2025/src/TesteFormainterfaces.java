public class TesteFormainterfaces{
    public static void main(String[] args) {
        Formainterfaces circulo = new Circulointerfaces(2);
        Formainterfaces retangulo = new Retangulointerfaces(3,4);

        System.out.println("area do circulo " + circulo.calcularArea());
        System.out.println("Area do retangulo " + retangulo.calcularArea());
    }
}
