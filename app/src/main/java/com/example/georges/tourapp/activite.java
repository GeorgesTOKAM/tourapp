package com.example.georges.tourapp;

import java.util.Date;

/**
 * Created by Georges on 28/04/2017.
 */

public class activite {

    private String nomPays;
    private String nomVille;
    private String addresse;
    private Date dateopen;
    private Date Horaire;
    private String activite;
    private String description;

    public activite(String nomPays, String nomVille, String addresse, Date dateopen, Date horaire, String activite, String description) {
        this.nomPays = nomPays;
        this.nomVille = nomVille;
        this.addresse = addresse;
        this.dateopen = dateopen;
        Horaire = horaire;
        this.activite = activite;
        this.description = description;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setDateopen(Date dateopen) {
        this.dateopen = dateopen;
    }

    public void setHoraire(Date horaire) {
        Horaire = horaire;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomPays() {
        return nomPays;
    }

    public String getNomVille() {
        return nomVille;
    }

    public String getAddresse() {
        return addresse;
    }

    public Date getDateopen() {
        return dateopen;
    }

    public Date getHoraire() {
        return Horaire;
    }

    public String getActivite() {
        return activite;
    }

    public String getDescription() {
        return description;
    }

}
