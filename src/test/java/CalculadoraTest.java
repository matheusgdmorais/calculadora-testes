import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calc.subtrair(4, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(12, calc.multiplicar(3, 4));
    }

    @Test
    void testDividir() {
        assertEquals(2.5, calc.dividir(5, 2));
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}