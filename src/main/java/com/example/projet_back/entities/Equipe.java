package com.example.projet_back.entities;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EQUIPE")
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer idEquipe ;
    private String nomEquipe ;
    private String thematique ;
    private int salle ;

    @Enumerated(EnumType.STRING)
    private Niveau niveau ;


    @ManyToMany(mappedBy = "equipe", fetch = FetchType.EAGER)
    private List<Etudiant> etudiant ;


}



