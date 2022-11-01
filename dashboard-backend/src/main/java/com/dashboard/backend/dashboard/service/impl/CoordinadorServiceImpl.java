package com.dashboard.backend.dashboard.service.impl;

import com.dashboard.backend.dashboard.entities.CoordinadorDash;
import com.dashboard.backend.dashboard.exceptions.BadRequestException;
import com.dashboard.backend.dashboard.exceptions.ResourceNotFoundException;
import com.dashboard.backend.dashboard.repository.CoordinadorRepository;
import com.dashboard.backend.dashboard.service.interfaces.CoordinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoordinadorServiceImpl implements CoordinadorService {
    @Autowired
    private CoordinadorRepository coordinadorRepository;





    @Override
    public List<CoordinadorDash> listCoordinador(){
        return coordinadorRepository.findAll();
    }

    @Override
    public CoordinadorDash addCoordinador(CoordinadorDash coordinadorDash) throws BadRequestException {
        return coordinadorRepository.save(coordinadorDash);
    }

    @Override
    public List<CoordinadorDash> listCoordinadorDash() {
        return null;
    }


    @Override
    public CoordinadorDash addCoordinadorDash (CoordinadorDash coordinadorDash){
        return coordinadorRepository.save(coordinadorDash);
    }
    @Override
    public Optional<CoordinadorDash> searchCoordinadorDashById(Integer id) throws ResourceNotFoundException {
        return coordinadorRepository.findById(id);
    }
    @Override
    public CoordinadorDash updateCoordinadorDash(CoordinadorDash coordinadorDash) throws ResourceNotFoundException, BadRequestException {
        return coordinadorRepository.save(coordinadorDash);
    }
    @Override
    public void deleteCoordinadorDash(Integer id) throws ResourceNotFoundException{
        coordinadorRepository.deleteById(id);
    }
}
