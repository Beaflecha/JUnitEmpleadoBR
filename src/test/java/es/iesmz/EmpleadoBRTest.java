package es.iesmz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("EXECUTE PROVA");
    }

    @Test
    public void testcalculaSalarioNeto1() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(2000.0f);
        float resultadoEsperado = 1640.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioNeto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1500.01f);
        float resultadoEsperado = 1230.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioNeto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto((1499.99f));
        float resultadoEsperado = 1259.9916f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioNeto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto((1250.0f));
        float resultadoEsperado = 1050.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioNeto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto((1000.0f));
        float resultadoEsperado = 840.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioNeto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto((999.99f));
        float resultadoEsperado = 999.99f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioNeto7() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto((500.0f));
        float resultadoEsperado = 500.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioNeto8() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto((0.0f));
        float resultadoEsperado = 0.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioNeto9() {
        float resultadoReal = EmpleadoBR.calculaSalarioNeto((-1.0f));
        float resultadoEsperado = -1.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto1() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, 2000.0f, 8.0f);
        float resultadoEsperado = 1360.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto2() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, 1500.0f, 3.0f);
        float resultadoEsperado = 1260.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto3() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, 1499.99f, 0.0f);
        float resultadoEsperado = 1100.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto4() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.encarregat, 1250.0f, 8.0f);
        float resultadoEsperado = 1760.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto5() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.encarregat, 1000.0f, 0.0f);
        float resultadoEsperado = 1600.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto6() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.encarregat, 999.99f, 3.0f);
        float resultadoEsperado = 1560.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto7() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.encarregat, 500.0f, 0.0f);
        float resultadoEsperado = 1500.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto8() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.encarregat, 0.0f, 8.0f);
        float resultadoEsperado = 1660.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto9() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, -1.0f, 8.0f);
        float resultadoEsperado = -1.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto10() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, 1500.0f, -1.0f);
        float resultadoEsperado = -1.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testcalculaSalarioBruto11() {
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                null, 1500.0f, 8.0f);
        float resultadoEsperado = -1.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
}