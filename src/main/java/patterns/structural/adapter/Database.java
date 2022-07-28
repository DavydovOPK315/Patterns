package patterns.structural.adapter;

public interface Database {
    void insert();

    void select();

    void update();

    void delete();
}
