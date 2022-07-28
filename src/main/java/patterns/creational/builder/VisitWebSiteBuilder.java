package patterns.creational.builder;

public class VisitWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit website");
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }
}
