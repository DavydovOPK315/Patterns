package patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project project = new Project(1, "Best project", "class Project{}");
        ProjectFactory projectFactory = new ProjectFactory(project);
        Project result = projectFactory.cloneProject();
        System.out.println(result);
    }
}
