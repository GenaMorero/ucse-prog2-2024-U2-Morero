import org.example.AvionComercial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AvionComercialTest {
    private AvionComercial avionComercial = new AvionComercial(100, 10);
    @Test
    public void TestVolarConsumo10Distancia100DeberiaDar1000() {
        assertEquals(1000, avionComercial.volar(100));
    }
}
