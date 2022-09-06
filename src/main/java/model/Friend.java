package model;

public class Friend extends Contact{
    private String spitzname;

    public Friend(){
        super();
    }

    public Friend(String name, String telefonnummer, String spitzname) {
        super(name, telefonnummer);
        this.spitzname = spitzname;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + getName() + '\'' +
                ", telefonnummer='" + getTelefonnummer() + '\'' +
                ", spitzname='" + spitzname + '\'' +
                '}';
    }
}
