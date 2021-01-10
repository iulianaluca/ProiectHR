package com.recruit.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="USERS")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nume;
    private String prenume;
    private Integer telefon;
    private Integer mobil;
    private String email;
    private String username;
    private String functie;
    private String descriere;
    
    @OneToMany(mappedBy="user_comm")
    private Collection<UserComment> comment;
    
    @OneToMany(mappedBy="user_pos")
    private Collection<Position> position;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ROLE")
    private Role user_role;

    
    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public Integer getMobil() {
        return mobil;
    }

    public void setMobil(Integer mobil) {
        this.mobil = mobil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Collection<UserComment> getComment() {
        return comment;
    }

    public void setComment(Collection<UserComment> comment) {
        this.comment = comment;
    }

    public Collection<Position> getPosition() {
        return position;
    }

    public void setPosition(Collection<Position> position) {
        this.position = position;
    }

    public Role getUser_role() {
        return user_role;
    }

    public void setUser_role(Role user_role) {
        this.user_role = user_role;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.recruit.entity.User[ id=" + id + " ]";
    }
    
}
