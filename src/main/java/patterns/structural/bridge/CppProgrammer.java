package patterns.structural.bridge;

public class CppProgrammer implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes cpp code...");
    }
}
