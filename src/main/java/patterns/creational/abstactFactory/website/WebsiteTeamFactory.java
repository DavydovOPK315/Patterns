package patterns.creational.abstactFactory.website;

import patterns.creational.abstactFactory.Developer;
import patterns.creational.abstactFactory.ProjectManager;
import patterns.creational.abstactFactory.ProjectTeamFactory;
import patterns.creational.abstactFactory.Tester;


public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
