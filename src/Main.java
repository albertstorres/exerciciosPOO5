//5 - ) Elabore uma classe Calculadora com métodos para realizar operações básicas
//      como ADIÇÃO, SUBTRAÇÃO, MULTIPLICAÇÃO e DIVISÃO.
import br.com.cubosacademy.exerciciospoo.quinto.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("2 + 2 = " + calculadora.adicao(2,2));
        System.out.println("2 - 2 = " + calculadora.subtracao(2,2));
        System.out.println("2 * 2 = " + calculadora.multiplicacao(2,2));
        System.out.println("2 / 2 = " + calculadora.dividao(2,2));
    }
}