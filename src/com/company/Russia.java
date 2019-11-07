package com.company;

public class Russia extends Countries {
    private String nameOfPresident;

    public Russia(String name, String capital, double population,String nameOfPresident) {
        super(name, capital, population);
        this.nameOfPresident = nameOfPresident;
    }

    public String getNameOfPresident() {
        return nameOfPresident;
    }

    public void setNameOfPresident(String nameOfPresident) {
        this.nameOfPresident = nameOfPresident;
    }

    @Override
    public void traditionalFood() {
        System.out.println("In Russia the traditional food is soleanca ");
    }

    @Override
    public String toString() {
        return getName() + "\nCapital : " + getCapital() +
                "\nPopulation : " + getPopulation() + "mln" +
                "\nPresident : " + nameOfPresident;

    }
}