package patterns.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {new BankProgram(new JavaProgrammer()),
                new StockExchange(new CppProgrammer())};

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
