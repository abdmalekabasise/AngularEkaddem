package com.example.projet_back.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

    @Entity
    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name = "DEPARTEMENTS")
    public class Departements {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Id")

        private Integer idDepart ;
        private String nomDepart ;

        @OneToMany(mappedBy = "departements")
        private List<Etudiant> etudiant ;

    }

