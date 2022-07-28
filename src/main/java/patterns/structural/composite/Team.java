package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void deleteDeveloper(Developer developer){
        developers.remove(developer);
    }

    public void createProject(){
        System.out.println("Team is creating a program...");
        for (Developer developer: developers) {
            developer.writeCode();
        }
    }
}