package com.homework.daniel.Model;

public class BestSeller extends Book{
    String summary;
    int worldCopies;

    public BestSeller(int id, String name, double price, String summary, int worldCopies) {
        super(id, name, price);
        this.summary = summary;
        this.worldCopies = worldCopies;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getWorldCopies() {
        return worldCopies;
    }

    public void setWorldCopies(int worldCopies) {
        this.worldCopies = worldCopies;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "BestSeller{" +
                "summary='" + summary + '\'' +
                ", worldCopies=" + worldCopies +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                "} " + super.toString();
    }
}
