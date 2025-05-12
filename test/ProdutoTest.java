import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testValorPositivo() {
        assertEquals(55.0, Produto.calcularNovoValor(50.0));
    }

    @Test
    void testValorInvalido() {
        assertNull(Produto.calcularNovoValor(0.0));
    }
}