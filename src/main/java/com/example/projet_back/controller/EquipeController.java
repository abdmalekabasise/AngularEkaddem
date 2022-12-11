package com.example.projet_back.controller;



import com.example.projet_back.entities.Equipe;
import com.example.projet_back.entities.Niveau;
import com.example.projet_back.repository.EquipeRepository;
import com.example.projet_back.service.IEquipeService;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.awt.*;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/equipe")
public class EquipeController {

    @Autowired
    private IEquipeService iEquipeService;

    @GetMapping("/get")
    public List<Equipe> equipe (){
        return iEquipeService.retrieveAllEquipe();
    }

    @PostMapping("/add")
    public ResponseEntity<Equipe> addEquipe(@RequestBody Equipe e) {
        return ResponseEntity.ok(this.iEquipeService.addEquipe(e));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Equipe> updateEquipe(@PathVariable("id") Integer id,@RequestBody Equipe e){
        return ResponseEntity.ok(this.iEquipeService.updateEquipe(id,e));
    }

    @GetMapping("/get/{id}")
    public Equipe getByIdEquipe (@PathVariable("id") Integer idE){
        return this.iEquipeService.getByIdEquipe(idE);
    }

    @DeleteMapping("/delete/{id}")
    public void  deleteEquipe (@PathVariable("id") int id){
        this.iEquipeService.deleteById(id);
    }
}
