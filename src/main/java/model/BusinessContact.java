package model;

public class BusinessContact extends Contact{
    private String companyName;

    public BusinessContact(){
        super();
    }

    public BusinessContact(String name, String telefonnummer, String companyName){
        super(name, telefonnummer);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "name='" + getName() + '\'' +
                ", telefonnummer='" + getTelefonnummer() + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
