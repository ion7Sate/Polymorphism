package com.company;

public class France extends Countries {
    private String officialLanguage;

    public France(String name, String capital, double population, String officialLanguage) {
        super(name, capital, population);
        this.officialLanguage = officialLanguage;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    @Override
    public void traditionalFood() {
        System.out.println("In France the traditional food is pancakes");
    }

    @Override
    public String toString() {
        return  getName() +"\nCapital : " + getCapital() +
                "\nPopulation : " + getPopulation() + "mln" +
                "\nOfficial Language : " + officialLanguage;



    }


}
