package com.example.projet_back.entities;




import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ETUDIANT")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer idEtudiant ;
    private String prenomE ;
    private String nomE ;

    @Enumerated(EnumType.STRING)
    private Option option ;


    @OneToMany(mappedBy = "etudiant")
    private List<Contrat> contrat ;

    @ManyToOne
    private Departements departements ;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="EQUIPE_ETUDIANT")
    private List<Equipe> equipe ;
}
