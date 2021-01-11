package com.recruit.common;


public class UserDetails implements java.io.Serializable{
    private Integer id;
    private String nume;
    private String prenume;
    private Integer telefon;
    private Integer mobil;
    private String email;
    private String username;
    private String functie;
    private String descriere;
    private String user_role;

    public UserDetails() {
    }

    public UserDetails(Integer id, String nume, String prenume, Integer telefon, Integer mobil, String email, String functie, String descriere, String user_role) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.mobil = mobil;
        this.email = email;
        this.functie = functie;
        this.descriere = descriere;
        this.user_role = user_role;
    }

    public Integer getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public Integer getMobil() {
        return mobil;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getFunctie() {
        return functie;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getUser_role() {
        return user_role;
    }
    
                                          
}
