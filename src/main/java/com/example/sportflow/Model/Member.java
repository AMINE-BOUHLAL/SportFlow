package com.example.sportflow.Model;

public class Member extends User{
    private int id;
    private int date;
    private String sport;

    public Member(int id, String name, String prenom, String email, String password, String role, int date, int id1, String sport) {
        super(id, name, prenom, email, password, role);
        this.date = date;
        this.id = id1;
        this.sport = sport;
    }

    public Member() {
        super();
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
