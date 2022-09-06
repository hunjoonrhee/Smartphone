package model;

public class Friend extends Contact{
    private String nickname;

    public Friend(){
        super();
    }

    public Friend(String name, String telefonnummer, String nickname) {
        super(name, telefonnummer);
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + getName() + '\'' +
                ", telefonnummer='" + getTelefonnummer() + '\'' +
                ", spitzname='" + nickname + '\'' +
                '}';
    }
}
