package com.book.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by rafael on 2015-05-06.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
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

    public Writer(String name, String surname, String placeOfBirth, Integer yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.yearOfBirth = yearOfBirth;
    }
}
