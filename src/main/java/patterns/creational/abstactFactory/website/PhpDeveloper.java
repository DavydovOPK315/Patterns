package patterns.creational.abstactFactory.website;

import patterns.creational.abstactFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes the website code...");
    }
}
