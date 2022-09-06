package model;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{

    private String modells;
    private String manufatures;
    private Contact [] constacts;

    public Smartphone(){
        super();
    }

    public Smartphone(String modells, String manufactures, Contact[] contacts){
        this.modells = modells;
        this.manufatures = manufactures;
        this.constacts = contacts;
    }

    public String getModells() {
        return modells;
    }

    public String getManufatures() {
        return manufatures;
    }

    public Contact[] getConstacts() {
        return constacts;
    }

    public void setModells(String modells) {
        this.modells = modells;
    }

    public void setManufatures(String manufatures) {
        this.manufatures = manufatures;
    }

    public void setConstacts(Contact[] constacts) {
        this.constacts = constacts;
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
                ", constacts=" + Arrays.toString(constacts) +
                '}';
    }
}
