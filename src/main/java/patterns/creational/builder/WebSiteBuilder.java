package patterns.creational.builder;

public abstract class WebSiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildPrice();

    abstract void buildCms();

    public Website getWebsite() {
        return website;
    }
}
