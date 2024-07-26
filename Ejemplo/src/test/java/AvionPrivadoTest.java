import org.example.AvionPrivado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionPrivadoTest {
    private AvionPrivado avionPrivado = new AvionPrivado(100, 10);
    @Test
    public void TestVolarConsumo10Distancia100DeberiaDar1000() {
        assertEquals(1050, avionPrivado.volar(100));
    }
}
