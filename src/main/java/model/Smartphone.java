package model;

import java.util.ArrayList;

public class Smartphone implements Radio, GPS{

    private String modells;
    private String manufatures;
    private ArrayList<Contact> contacts;

    public Smartphone(){
        super();
    }

    public Smartphone(String modells, String manufactures, ArrayList<Contact> contacts){
        this.modells = modells;
        this.manufatures = manufactures;
        this.contacts = contacts;
    }

    public String getModells() {
        return modells;
    }

    public String getManufatures() {
        return manufatures;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setModells(String modells) {
        this.modells = modells;
    }

    public void setManufatures(String manufatures) {
        this.manufatures = manufatures;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    public void addContact(Contact contact){
        contacts.add(contact);
        setContacts(contacts);
    }
    public Contact getContact(int index){
        if(index>=contacts.size() || index<0){
            System.out.println("invalid index!");
            return null;
        }else{
            return contacts.get(index);
        }
    }

    public Contact getContactByName(String name){
        int index = 0;
        for(Contact contact:contacts){
            if(contact.getName().equals(name)){
                index = contacts.indexOf(contact);
                break;
            }
        }
        return getContact(index);
    }

    public void removeContactByName(String name){
        int index = 0;
        for(Contact contact:contacts){
            if(contact.getName().equals(name)){
                index = contacts.indexOf(contact);
                break;
            }
        }
        contacts.remove(index);
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modells='" + modells + '\'' +
                ", manufatures='" + manufatures + '\'' +
                ", constacts=" + contacts.toString() +
                '}';
    }
}
