package com.book.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by rafael on 10.05.16.
 */

@Entity
@Table(name = "books")
public class Books implements Serializable{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "title", nullable = true)
    private String title;

    @Column(name = "publicationDate", nullable = true)
//    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
//    private DateTime publicationDate;
    private String publicationDate;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "category", nullable = true)
    @Column(name = "category", nullable = true)
    private String category;

    public Books() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (getId() != null ? !getId().equals(books.getId()) : books.getId() != null) return false;
        if (getTitle() != null ? !getTitle().equals(books.getTitle()) : books.getTitle() != null) return false;
        if (getPublicationDate() != null ? !getPublicationDate().equals(books.getPublicationDate()) : books.getPublicationDate() != null)
            return false;
        return getCategory() != null ? getCategory().equals(books.getCategory()) : books.getCategory() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getPublicationDate() != null ? getPublicationDate().hashCode() : 0);
        result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Books{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", publicationDate=").append(publicationDate);
        sb.append(", category='").append(category).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
