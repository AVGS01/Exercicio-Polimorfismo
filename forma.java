abstract class Forma {
    // Método abstrato para calcular a área
    public abstract double calcularArea();
}


class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um array de formas
        Forma[] formas = new Forma[3];
        formas[0] = new Circulo(5);         // Circulo com raio 5
        formas[1] = new Retangulo(4, 6);    // Retângulo com largura 4 e altura 6
        formas[2] = new Triangulo(3, 8);    // Triângulo com base 3 e altura 8

        // Exibindo a área de cada forma
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
