package patterns.creational.abstactFactory.banking;

import patterns.creational.abstactFactory.Developer;
import patterns.creational.abstactFactory.ProjectManager;
import patterns.creational.abstactFactory.ProjectTeamFactory;
import patterns.creational.abstactFactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankPM();
    }
}
