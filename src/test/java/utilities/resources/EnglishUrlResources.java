package utilities.resources;

public class EnglishUrlResources implements UrlResources {

    private static final String PREFIX =BASE_URL;

    @Override
    public String getBaseUrl() {
        return PREFIX;
    }


}
