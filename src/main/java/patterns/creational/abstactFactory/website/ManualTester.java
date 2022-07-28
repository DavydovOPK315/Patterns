package patterns.creational.abstactFactory.website;

import patterns.creational.abstactFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tests the website...");
    }
}
