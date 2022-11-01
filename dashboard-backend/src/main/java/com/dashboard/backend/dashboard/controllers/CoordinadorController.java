package com.dashboard.backend.dashboard.controllers;

import com.dashboard.backend.dashboard.entities.CoordinadorDash;
import com.dashboard.backend.dashboard.exceptions.BadRequestException;
import com.dashboard.backend.dashboard.exceptions.ResourceNotFoundException;
import com.dashboard.backend.dashboard.service.interfaces.CoordinadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/coordinador_dash")
@CrossOrigin("*")
public class CoordinadorController {
    @Autowired
    private CoordinadorService coordinadorService;

    @GetMapping
    public ResponseEntity<List<CoordinadorDash>> listCoordinadorDash(){
        return ResponseEntity.ok(coordinadorService.listCoordinadorDash());
    }
    @PostMapping
    public ResponseEntity addCoordinadorDash (@RequestBody CoordinadorDash coordinadorDash) throws BadRequestException{

        String title = coordinadorDash.getTitle();
        String value1 = coordinadorDash.getValue1();
        String value2 = coordinadorDash.getValue2();
        String value3 = coordinadorDash.getValue3();
        String value4 = coordinadorDash.getValue4();


        if (title.isBlank() || title==null
                || value1.isBlank() || value1==null){
            throw new BadRequestException("Title and value must be completed.");
        }
        return ResponseEntity.ok(coordinadorService.addCoordinadorDash(coordinadorDash));
    }

    @GetMapping("/{id}")
    public ResponseEntity searchCoordinadorDash(@PathVariable Integer id) throws ResourceNotFoundException {
        Optional<CoordinadorDash> searchedCoordinadorDash = coordinadorService.searchCoordinadorDashById(id);
        if (searchedCoordinadorDash.isEmpty()){
            throw new ResourceNotFoundException("ID \" +id+\" not found.");
        }
        return ResponseEntity.ok(searchedCoordinadorDash.get());
    }
    @PutMapping
    public ResponseEntity<CoordinadorDash> updateCoordinadorDash (@RequestBody CoordinadorDash coordinadorDash) throws ResourceNotFoundException, BadRequestException {
        Optional<CoordinadorDash> searchedCoordinadorDash = coordinadorService.searchCoordinadorDashById(coordinadorDash.getId());
        String title = coordinadorDash.getTitle();
        String value1 = coordinadorDash.getValue1();
        String value2 = coordinadorDash.getValue2();
        String value3 = coordinadorDash.getValue3();
        String value4 = coordinadorDash.getValue4();


        if (searchedCoordinadorDash.isEmpty()){
            throw new ResourceNotFoundException("ID \" +id+\" not found.");
        }
        else if (title.isBlank() || title==null
                || value1.isBlank() || value1==null){
            throw new BadRequestException("Title and value must be completed.");
        }
        return ResponseEntity.ok(coordinadorService.updateCoordinadorDash(coordinadorDash));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCoordinadorDash(@PathVariable Integer id) throws ResourceNotFoundException{
        Optional<CoordinadorDash> searchedCoordinadorDash = coordinadorService.searchCoordinadorDashById(id);
        if (searchedCoordinadorDash.isEmpty()){
            throw new ResourceNotFoundException("ID \" +id+\" not found.");
        }
        coordinadorService.deleteCoordinadorDash(id);
        return ResponseEntity.ok("Values successfully deleted.");
    }

}
