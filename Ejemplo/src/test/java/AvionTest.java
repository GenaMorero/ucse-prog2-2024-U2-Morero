import org.example.AvionComercial;
import org.example.AvionPrivado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionTest {
    private AvionComercial avionComercial = new AvionComercial(100, 10);
    private AvionPrivado avionPrivado = new AvionPrivado(100, 10);

    @Test
    public void TestGetCapacidadCombustibleDeberiADar100() {
        assertEquals(100, avionComercial.getCapacidadCombustible());
        assertEquals(100, avionPrivado.getCapacidadCombustible());
    }
    @Test
    public void TestGetConsumoCombustibleDeberiADar10() {
        assertEquals(10, avionComercial.getConsumoCombustible());
        assertEquals(10, avionPrivado.getConsumoCombustible());
    }
}
