package Records;

public class RunRecord {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(5.0, 3.0);

        System.out.println("Altura: " + retangulo.altura());
        System.out.println("Largura: " + retangulo.largura());
        System.out.println("Area: " + retangulo.area());
        System.out.println("Perimetro: " + retangulo.perimetro());

        System.out.println(retangulo.toString());

        Retangulo Quadrado = Retangulo.Retanguloquadrado(5.0);
        System.out.println("Area: " + Quadrado.area());
    }
}
