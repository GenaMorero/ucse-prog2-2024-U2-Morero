import org.example.Avion;
import org.example.AvionPrivado;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorCombustibleTest {
    @Test
    public void TestCalcularCombustibleAvionPrivadoDeberiaDar5050() {
        Avion avion = new AvionPrivado(100, 10);
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
        assertEquals(5050, calculadorCombustible.calcularCombustible(avion, 500));
    }
    @Test
    public void TestCalcularCombustibleAvionComercialDeberiaDar1000() {
        Avion avion = new AvionPrivado(100, 10);
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
        assertEquals(1050, calculadorCombustible.calcularCombustible(avion, 100));
    }
    @Test
    public void TestGetInstanceDeberiaDarInstancia() {
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
        CalculadorCombustible calculadorCombustible2 = CalculadorCombustible.getInstance();
        assertEquals(calculadorCombustible, calculadorCombustible2);
    }
}
