package com.recruit.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CANDIDATES")
public class Candidate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idcandidate;
    private String nume;
    private String prenume;
    private String telefon;
    private String email;
    private String adresa;
    private String cv;
    private Boolean relocare;
    private Boolean acceptat;
    
    @OneToMany(mappedBy = "candidate_comm")
    private Collection<CandidateComment> candidate_comment;
    
    @ManyToMany
    @JoinTable(name = "POSITION_CANDIDATE", joinColumns = {
    @JoinColumn(name = "CANDIDATE_IDCANDIDATE", referencedColumnName = "IDCANDIDATE")}, inverseJoinColumns = {
    @JoinColumn(name = "POSITION_IDPOSITION", referencedColumnName = "IDPOSITION")})
    private Collection<Position> positionCollection;

    public Candidate() {
    }
    

    public Integer getIdcandidate() {
        return idcandidate;
    }

    public void setIdcandidate(Integer idcandidate) {
        this.idcandidate = idcandidate;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Boolean getRelocare() {
        return relocare;
    }

    public void setRelocare(Boolean relocare) {
        this.relocare = relocare;
    }

    public Boolean getAcceptat() {
        return acceptat;
    }

    public void setAcceptat(Boolean acceptat) {
        this.acceptat = acceptat;
    }

    public Collection<CandidateComment> getCandidate_comment() {
        return candidate_comment;
    }

    public void setCandidate_comment(Collection<CandidateComment> candidate_comment) {
        this.candidate_comment = candidate_comment;
    }

    public Collection<Position> getPositionCollection() {
        return positionCollection;
    }

    public void setPositionCollection(Collection<Position> positionCollection) {
        this.positionCollection = positionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcandidate != null ? idcandidate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidate)) {
            return false;
        }
        Candidate other = (Candidate) object;
        if ((this.idcandidate == null && other.idcandidate != null) || (this.idcandidate != null && !this.idcandidate.equals(other.idcandidate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.recruit.entity.Candidate[ id=" + idcandidate + " ]";
    }
    
}
