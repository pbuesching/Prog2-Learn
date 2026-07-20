package patterns.TemplateMethod.Getraenke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeeTest {

    @Test
    void zutatenHinzufuegen() {

        Tee apfeltee = new Tee();

        apfeltee.TemplateMethod();

        assertEquals("Apfelstückchen", apfeltee.zutaten[2]);
    }
}