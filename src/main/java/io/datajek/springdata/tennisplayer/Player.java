package io.datajek.springdata.tennisplayer;

import java.util.Date;

public class Player {

    private int ID;
    private String Name;
    private String Nationality;
    private Date Birth_date;
    private int Titles;

    // no argument constructor
    public Player() {

    }

    public Player(int id, String name, String nationality, Date birthdate, int titles) {
        super();
        this.ID = id;
        this.Name = name;
        this.Nationality = nationality;
        this.Birth_date = birthdate;
        this.Titles = titles;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getNationality() {
        return Nationality;
    }

    public Date getBirth_date() {
        return Birth_date;
    }

    public int getTitles() {
        return Titles;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public void setBirth_date(Date birth_date) {
        Birth_date = birth_date;
    }

    public void setTitles(int titles) {
        Titles = titles;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + ID +
                ", name='" + Name + '\'' +
                ", nationality='" + Nationality + '\'' +
                ", birthdate=" + Birth_date +
                ", titles=" + Titles +
                '}';
    }
}
