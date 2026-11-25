package adapter.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LeitorTest {

    @Test
    void deveRetornarPaginasLidas() {
        Leitor leitor = new Leitor(400);
        leitor.setProgresso(100);

        assertEquals(100, leitor.getProgresso());
    }

    @Test
    void deveRetornarPercentualLido() {
        Leitor leitor = new Leitor(400);
        leitor.setProgresso(100);

        assertEquals(25.0f, leitor.getPercentual());
    }

    @Test
    void deveRetornarPercentualAproximado() {
        Leitor leitor = new Leitor(300);
        leitor.setProgresso(100);

        assertEquals(33.33f, leitor.getPercentual(), 0.01f);
    }

    @Test
    void deveLimitarPercentualAoTerminarObra() {
        Leitor leitor = new Leitor(400);
        leitor.setProgresso(450);

        assertEquals(100.0f, leitor.getPercentual());
        assertEquals(400, leitor.getProgresso());
    }
}
