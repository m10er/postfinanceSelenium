package utilities.resources;

public class ItalienischUrlResources implements UrlResources {

    private static final String PREFIX = BASE_URL+"/it";

    @Override
    public String getBaseUrl() {
        return PREFIX;
    }

}
