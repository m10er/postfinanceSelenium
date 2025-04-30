package utilities.resources;

public class FrenchUrlResources implements UrlResources {

    private static final String PREFIX = BASE_URL+"/fr";

    @Override
    public String getBaseUrl() {
        return PREFIX;
    }

}
