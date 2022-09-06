package model;

public abstract class Contact {

    private String name;
    private String telefonnummer;

    public Contact(String name, String telefonnummer){
        this.name = name;
        this.telefonnummer = telefonnummer;
    }

    public Contact() {

    }

    public String getName(){
        return name;
    }
    public String getTelefonnummer(){
        return telefonnummer;
    }
}
