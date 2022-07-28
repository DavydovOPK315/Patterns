package patterns.creational.abstactFactory.website;

import patterns.creational.abstactFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manage the website...");
    }
}
