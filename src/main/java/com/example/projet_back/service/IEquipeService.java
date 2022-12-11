package com.example.projet_back.service;

import com.example.projet_back.entities.Equipe;
import com.example.projet_back.entities.Niveau;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipe();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe(int id, Equipe e) ;

    Equipe getByIdEquipe(Integer idE);

    void deleteById(int id);
}
