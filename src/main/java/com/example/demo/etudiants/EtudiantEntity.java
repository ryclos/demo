package com.example.demo.etudiants;


import jakarta.persistence.*;

@Entity
@Table(name = "etudiant")
public class EtudiantEntity {

    @Id
    public Long id;
    @Column(name = "name")
    public String name;

    public EtudiantEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public EtudiantEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EtudiantEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
