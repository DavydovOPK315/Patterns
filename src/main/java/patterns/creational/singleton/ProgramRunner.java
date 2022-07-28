package patterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();
        programLogger.addLogFile("first log");
        programLogger.addLogFile("second log");
        programLogger.addLogFile("third log");
        programLogger.addLogFile("fifth log");
        programLogger.showLogFile();
    }
}
