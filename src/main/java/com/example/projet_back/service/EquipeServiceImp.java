package com.example.projet_back.service;


import com.example.projet_back.entities.Equipe;
import com.example.projet_back.repository.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class EquipeServiceImp implements IEquipeService{

    @Autowired
    private EquipeRepository equipeRepository ;

    @Override
    public List<Equipe> retrieveAllEquipe(){
        return new ArrayList<>(this.equipeRepository.findAll());
    }


    public Equipe addEquipe(Equipe e){
        return equipeRepository.save(e);
    }

    @Override
    public  Equipe   updateEquipe(int id ,Equipe e) {
        Equipe equipe1= equipeRepository.findById(id).orElse(null);
        if (equipe1!=null){
            equipe1.setNomEquipe(e.getNomEquipe());
            equipe1.setIdEquipe(e.getIdEquipe());
            equipe1.setSalle(e.getSalle());
            equipe1.setThematique(e.getThematique());
            equipe1.setNiveau(e.getNiveau());
            return equipeRepository.save(equipe1);
        }
        else return null;


    }

    @Override
    public Equipe getByIdEquipe (Integer idE){
        return this.equipeRepository.findById(idE).get();
    }

    @Override
    public void deleteById(int id){
         this.equipeRepository.deleteById(id);
    }
}

