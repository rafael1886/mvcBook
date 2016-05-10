package com.book.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by rafael on 10.05.16.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "books")
public class Books implements Serializable{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "title", nullable = true)
    private String title;
}
