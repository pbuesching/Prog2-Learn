package patterns.VisitorPattern;

public interface Visitor {
    public void visit(CPU cpu);
    public void visit(GPU gpu);
    public void visit(RAM ram);
}

interface ComputerTeile {
    public void accept(Visitor visitor);
}

class CPU implements ComputerTeile {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class GPU implements ComputerTeile {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class RAM  implements ComputerTeile {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class EnergyVisitor implements Visitor {
    private int totalWatt = 0;
    public void visit(CPU cpu) {
        totalWatt += 60;
        System.out.println("CPU: 60 Watt");
    }

    public void visit(GPU gpu) {
        totalWatt += 300;
        System.out.println("GPU: 300 Watt");
    }

    public void visit(RAM ram) {
        totalWatt += 5;
        System.out.println("RAM: 5 Watt");
    }

    public int getTotalWatt() {
        return totalWatt;
    }
}

class PriceVisitor implements Visitor {
    private int allPrice = 0;
    public void visit(CPU cpu) {
        allPrice += 200;
        System.out.println("CPU: 200€");
    }

    public void visit(GPU gpu) {
        allPrice += 500;
        System.out.println("GPU: 500€");
    }

    public void visit(RAM ram) {
        allPrice += 55;
        System.out.println("RAM: 55€");
    }

    public int getAllPrice() {
        return allPrice;
    }
}
