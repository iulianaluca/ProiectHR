package com.recruit.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="POSITIONS")
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idposition;
    private String nume;
    private String nr_persoane;
    private String department;
    private String cerinte;
    private String responsabilitati;
    private String proiect;
    private String opened;
    private String closed;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_KEY")
    private User user_pos;
    
    @OneToMany(mappedBy="position_comm")
    private Collection<PositionComment> position;
    
    @ManyToMany(mappedBy = "positionCollection")
    private Collection<Candidate> candidateCollection;

    public Position() {
    }

    public Integer getIdposition() {
        return idposition;
    }

    public void setIdposition(Integer idposition) {
        this.idposition = idposition;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNr_persoane() {
        return nr_persoane;
    }

    public void setNr_persoane(String nr_persoane) {
        this.nr_persoane = nr_persoane;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCerinte() {
        return cerinte;
    }

    public void setCerinte(String cerinte) {
        this.cerinte = cerinte;
    }

    public String getResponsabilitati() {
        return responsabilitati;
    }

    public void setResponsabilitati(String responsabilitati) {
        this.responsabilitati = responsabilitati;
    }

    public String getProiect() {
        return proiect;
    }

    public void setProiect(String proiect) {
        this.proiect = proiect;
    }

    public String getOpened() {
        return opened;
    }

    public void setOpened(String opened) {
        this.opened = opened;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public User getUser_pos() {
        return user_pos;
    }

    public void setUser_pos(User user_pos) {
        this.user_pos = user_pos;
    }

    public Collection<PositionComment> getPosition() {
        return position;
    }

    public void setPosition(Collection<PositionComment> position) {
        this.position = position;
    }

    public Collection<Candidate> getCandidateCollection() {
        return candidateCollection;
    }

    public void setCandidateCollection(Collection<Candidate> candidateCollection) {
        this.candidateCollection = candidateCollection;
    }

    
 

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idposition != null ? idposition.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Position)) {
            return false;
        }
        Position other = (Position) object;
        if ((this.idposition == null && other.idposition != null) || (this.idposition != null && !this.idposition.equals(other.idposition))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.recruit.entity.Position[ id=" + idposition + " ]";
    }
    
}
