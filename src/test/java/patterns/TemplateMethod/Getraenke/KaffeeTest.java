package patterns.TemplateMethod.Getraenke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaffeeTest {

    @Test
    void zutatenHinzufuegen() {

        Kaffee milchkaffee = new Kaffee();

        milchkaffee.TemplateMethod();

        assertEquals("Zucker", milchkaffee.zutaten[2]);
    }
}