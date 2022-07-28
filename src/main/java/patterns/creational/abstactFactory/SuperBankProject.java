package patterns.creational.abstactFactory;

import patterns.creational.abstactFactory.banking.BankTeamFactory;

public class SuperBankProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating the super bank project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
