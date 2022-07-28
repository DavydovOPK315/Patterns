package patterns.creational.builder;

public class Director {

    WebSiteBuilder webSiteBuilder;

    void setWebSiteBuilder(WebSiteBuilder webSiteBuilder) {
        this.webSiteBuilder = webSiteBuilder;
    }

    Website buildWebsite() {
        webSiteBuilder.createWebsite();
        webSiteBuilder.buildName();
        webSiteBuilder.buildPrice();
        webSiteBuilder.buildCms();

        Website website = webSiteBuilder.getWebsite();

        return website;
    }
}
