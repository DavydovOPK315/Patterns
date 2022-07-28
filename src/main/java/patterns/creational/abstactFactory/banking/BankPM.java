package patterns.creational.abstactFactory.banking;

import patterns.creational.abstactFactory.ProjectManager;

public class BankPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages the bank...");
    }
}
