package com.dashboard.backend.dashboard.controllers;

import com.dashboard.backend.dashboard.entities.GerenteDash;
import com.dashboard.backend.dashboard.exceptions.BadRequestException;
import com.dashboard.backend.dashboard.exceptions.ResourceNotFoundException;
import com.dashboard.backend.dashboard.service.interfaces.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/gerente_dash")
@CrossOrigin("*")
public class GerenteController {
    @Autowired
    private GerenteService gerenteService;

    @GetMapping
    public ResponseEntity<List<GerenteDash>> listGerenteDash(){
        return ResponseEntity.ok(gerenteService.listGerenteDash());
    }
    @PostMapping
    public ResponseEntity addGerenteDash (@RequestBody GerenteDash gerenteDash) throws BadRequestException{

        String title = gerenteDash.getTitle();
        String value1 = gerenteDash.getValue1();
        String value2 = gerenteDash.getValue2();
        String value3 = gerenteDash.getValue3();
        String value4 = gerenteDash.getValue4();


        if (title.isBlank() || title==null
                || value1.isBlank() || value1==null){
            throw new BadRequestException("Title and value must be completed.");
        }
        return ResponseEntity.ok(gerenteService.addGerenteDash(gerenteDash));
    }

    @GetMapping("/{id}")
    public ResponseEntity searchGerenteDash(@PathVariable Integer id) throws ResourceNotFoundException {
        Optional<GerenteDash> searchedGerenteDash = gerenteService.searchGerenteDashById(id);
        if (searchedGerenteDash.isEmpty()){
            throw new ResourceNotFoundException("ID \" +id+\" not found.");
        }
        return ResponseEntity.ok(searchedGerenteDash.get());
    }
    @PutMapping
    public ResponseEntity<GerenteDash> updateGerenteDash (@RequestBody GerenteDash gerenteDash) throws ResourceNotFoundException, BadRequestException {
        Optional<GerenteDash> searchedGerenteDash = gerenteService.searchGerenteDashById(gerenteDash.getId());
        String title = gerenteDash.getTitle();
        String value1 = gerenteDash.getValue1();
        String value2 = gerenteDash.getValue2();
        String value3 = gerenteDash.getValue3();
        String value4 = gerenteDash.getValue4();


        if (searchedGerenteDash.isEmpty()){
            throw new ResourceNotFoundException("ID \" +id+\" not found.");
        }
        else if (title.isBlank() || title==null
                || value1.isBlank() || value1==null){
            throw new BadRequestException("Title and value must be completed.");
        }
        return ResponseEntity.ok(gerenteService.updateGerenteDash(gerenteDash));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteGerenteDash(@PathVariable Integer id) throws ResourceNotFoundException{
        Optional<GerenteDash> searchedGerenteDash = gerenteService.searchGerenteDashById(id);
        if (searchedGerenteDash.isEmpty()){
            throw new ResourceNotFoundException("ID \" +id+\" not found.");
        }
        gerenteService.deleteGerenteDash(id);
        return ResponseEntity.ok("Values successfully deleted.");
    }

}
