package patterns.creational.builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }
}
