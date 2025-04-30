package model;

public class PayingFormBody {
    private String firstName;
    private String lastName;
    private String companyName;
    private String townCity;
    private String streetAdress;
    private String apartmen;
    private String postCode;
    private String phone;
    private String emailAddres;

    public PayingFormBody() {
    }

    public PayingFormBody(String firstName, String lastName, String companyName,
                          String townCity, String streetAdress, String apartmen,
                          String postCode, String phone, String emailAddres) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.townCity = townCity;
        this.streetAdress = streetAdress;
        this.apartmen = apartmen;
        this.postCode = postCode;
        this.phone = phone;
        this.emailAddres = emailAddres;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTownCity() {
        return townCity;
    }

    public void setTownCity(String townCity) {
        this.townCity = townCity;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getApartmen() {
        return apartmen;
    }

    public void setApartmen(String apartmen) {
        this.apartmen = apartmen;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddres() {
        return emailAddres;
    }

    public void setEmailAddres(String emailAddres) {
        this.emailAddres = emailAddres;
    }
}
