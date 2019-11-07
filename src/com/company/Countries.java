package com.company;

public abstract class Countries {
    private String name;
    private String capital;
    private double population;

    public Countries(String name,String capital,double population){
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    abstract public void traditionalFood();

}

