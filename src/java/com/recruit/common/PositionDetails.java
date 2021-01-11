package com.recruit.common;


public class PositionDetails  implements java.io.Serializable{
    
    private Integer idposition;
    private String nume;
    private String nr_persoane;
    private String department;
    private String cerinte;
    private String responsabilitati;
    private String proiect;
    private String opened;
    private String closed;
    private String user_pos;
    
    
    public PositionDetails(){
    }
    
    
    public PositionDetails(Integer idposition, String nume, String nr_persoane, String department, String cerinte, String responsabilitati, String proiect, String opened, String closed, String user_pos) {
        
        this.idposition = idposition;
        this.nume = nume;
        this.nr_persoane = nr_persoane;
        this.department = department;
        this.cerinte = cerinte;
        this.responsabilitati = responsabilitati;
        this.proiect = proiect;
        this.opened = opened;
        this.closed = closed;
        this.user_pos = user_pos;
    }

    public Integer getIdposition() {
        return idposition;
    }

    public String getNume() {
        return nume;
    }

    public String getNr_persoane() {
        return nr_persoane;
    }

    public String getDepartment() {
        return department;
    }

    public String getCerinte() {
        return cerinte;
    }

    public String getResponsabilitati() {
        return responsabilitati;
    }

    public String getProiect() {
        return proiect;
    }

    public String getOpened() {
        return opened;
    }

    public String getClosed() {
        return closed;
    }

    public String getUser_pos() {
        return user_pos;
    }
     
    
    
    
}
