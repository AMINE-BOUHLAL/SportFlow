package com.example.sportflow.Model;

public class Entraineur extends User{
    private int id;
    private String specialite;

    public Entraineur(int id, String name, String prenom, String email, String password, String role, int id1, String specialite) {
        super(id, name, prenom, email, password, role);
        this.id = id1;
        this.specialite = specialite;
    }

    public Entraineur() {
        super();
    }







    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
