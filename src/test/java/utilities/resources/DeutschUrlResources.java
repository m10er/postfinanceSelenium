package utilities.resources;

public class DeutschUrlResources implements UrlResources {

    private static final String PREFIX =BASE_URL+ "de";

    @Override
    public String getBaseUrl() {
        return PREFIX;
    }


}
