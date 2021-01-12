/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recruit.common;

import com.recruit.entity.Candidate;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author enead
 */
public class CandidateDetails implements java.io.Serializable{
     private Integer idcandidate;
     private boolean acceptat;
     private String adresa;
     private String email;
    private String nume;
    private String prenume;
    private boolean relocare;
    private String telefon;
    private String cv;
    
    public CandidateDetails() {
    }

    public CandidateDetails(Integer idcandidate, boolean acceptat, String adresa, String email, String nume, String prenume, String cv, boolean relocare, String telefon) {
        this.idcandidate = idcandidate;
        this.acceptat = acceptat;
        this.adresa = adresa;
        this.email = email;
        this.nume = nume;
        this.prenume = prenume;
        this.cv=cv;
        this.relocare = relocare;
        this.telefon = telefon;
    }

    public CandidateDetails(Integer idcandidate, String nume, String prenume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getIdcandidate() {
        return idcandidate;
    }

    public boolean getAcceptat() {
        return acceptat;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getEmail() {
        return email;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public boolean isAcceptat() {
        return acceptat;
    }

    public boolean isRelocare() {
        return relocare;
    }

    public String getCv() {
        return cv;
    }
    

    public boolean getRelocare() {
        return relocare;
    }

    public String getTelefon() {
        return telefon;
    }

  

   
    
}
