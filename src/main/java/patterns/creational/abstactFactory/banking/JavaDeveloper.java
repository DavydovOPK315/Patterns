package patterns.creational.abstactFactory.banking;

import patterns.creational.abstactFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper writes code...");
    }
}
