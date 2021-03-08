package uaslp.enginering.exam;

public class Guest {
    private String name;
    private String ddress;;
    private String Country;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String ddress) {
        this.ddress = ddress;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getDdress() {
        return ddress;
    }

    public String getCountry() {
        return Country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
