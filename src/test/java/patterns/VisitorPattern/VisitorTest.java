package patterns.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {
    static List<ComputerTeile> teile;

    @BeforeAll
    static void setUp() {
        //given
        teile = new ArrayList<>();
        teile.add(new CPU());
        teile.add(new GPU());
        teile.add(new RAM());
        teile.add(new RAM());
    }

    @Test
    void energyVisitTest() {
        //given
        EnergyVisitor visitPower = new EnergyVisitor();

        //when
        for (ComputerTeile teilPC : teile) {
            teilPC.accept(visitPower);
        }
        int gesamtWatt =  visitPower.getTotalWatt();
        System.out.println("\nGesamt: " + gesamtWatt + " Watt \n");

        //then
        assertEquals(370, gesamtWatt);
    }

    @Test
    void moneyVisitTest() {
        //given
        PriceVisitor visitMoney = new PriceVisitor();

        //when
        for (ComputerTeile teilPC : teile) {
            teilPC.accept(visitMoney);
        }
        int gesamtPreis = visitMoney.getAllPrice();
        System.out.println("\nGesamt: " + gesamtPreis + "€ \n");

        //then
        assertEquals(810, gesamtPreis);
    }


}