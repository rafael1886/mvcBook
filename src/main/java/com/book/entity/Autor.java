package com.book.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by rafael on 2015-05-06.
 */
@Entity
@Table (name = "autor")
public class Autor implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column (name = "imie", nullable = false)
    private String imie;
    @Column (name = "nazwisko", nullable = false)
    private String nazwisko;
    @Column (name = "miejsceUrodzenia", nullable = false)
    private String miejsceUrodzenia;
    @Column (name = "rokUrodzenia", nullable = false)//, columnDefinition = "YEAR")
    private Integer rokUrodzenia;

    public Autor() {
    }

    public Autor(String imie, String nazwisko, String miejsceUrodzenia, Integer rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.rokUrodzenia = rokUrodzenia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiejsceUrodzenia() {
        return miejsceUrodzenia;
    }

    public void setMiejsceUrodzenia(String miejsceUrodzenia) {
        this.miejsceUrodzenia = miejsceUrodzenia;
    }

    public Integer getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(Integer rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejsceUrodzenia='" + miejsceUrodzenia + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }
}
