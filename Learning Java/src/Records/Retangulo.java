package Records;

public record Retangulo(double largura, double altura) {

    public Retangulo{
        if (largura <= 0 || altura <= 0){
            throw new IllegalArgumentException();
        }

    }
        public double area(){
            return largura * altura;
        }

        public double perimetro(){
            return 2 * (altura + largura);
        }

        public static Retangulo Retanguloquadrado(double lado){
            return new Retangulo(lado, lado);
        }
}
