package patterns.structural.bridge;

public class BankProgram extends Program{
    protected BankProgram(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Bank program is developing...");
        developer.writeCode();
    }
}
