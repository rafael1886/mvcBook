package com.book.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by rafael on 2015-05-06.
 */

@Entity
@Table(name = "writer")
public class Writer implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "placeOfBirth", nullable = false)
    private String placeOfBirth;
    @Column(name = "yearOfBirth", nullable = false)//, columnDefinition = "YEAR")
    private Integer yearOfBirth;

    public Writer() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Writer writer = (Writer) o;

        if (getId() != null ? !getId().equals(writer.getId()) : writer.getId() != null) return false;
        if (getName() != null ? !getName().equals(writer.getName()) : writer.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(writer.getSurname()) : writer.getSurname() != null)
            return false;
        if (getPlaceOfBirth() != null ? !getPlaceOfBirth().equals(writer.getPlaceOfBirth()) : writer.getPlaceOfBirth() != null)
            return false;
        return getYearOfBirth() != null ? getYearOfBirth().equals(writer.getYearOfBirth()) : writer.getYearOfBirth() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getPlaceOfBirth() != null ? getPlaceOfBirth().hashCode() : 0);
        result = 31 * result + (getYearOfBirth() != null ? getYearOfBirth().hashCode() : 0);
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
