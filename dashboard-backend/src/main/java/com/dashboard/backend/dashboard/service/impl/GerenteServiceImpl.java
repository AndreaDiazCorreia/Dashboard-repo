package com.dashboard.backend.dashboard.service.impl;

import com.dashboard.backend.dashboard.entities.GerenteDash;
import com.dashboard.backend.dashboard.exceptions.BadRequestException;
import com.dashboard.backend.dashboard.exceptions.ResourceNotFoundException;
import com.dashboard.backend.dashboard.repository.GerenteRepository;
import com.dashboard.backend.dashboard.service.interfaces.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GerenteServiceImpl implements GerenteService {
    @Autowired
    private GerenteRepository gerenteRepository;
    @Override
    public List<GerenteDash> listGerenteDash(){
        return gerenteRepository.findAll();
    }
    @Override
    public GerenteDash addGerenteDash(GerenteDash gerenteDash){
        return gerenteRepository.save(gerenteDash);
    }
    @Override
    public Optional<GerenteDash> searchGerenteDashById(Integer id) throws ResourceNotFoundException{
        return gerenteRepository.findById(id);
    }
    @Override
    public GerenteDash updateGerenteDash(GerenteDash gerenteDash) throws ResourceNotFoundException, BadRequestException{
        return gerenteRepository.save(gerenteDash);
    }
    @Override
    public void deleteGerenteDash(Integer id) throws ResourceNotFoundException{
        gerenteRepository.deleteById(id);
    }

}
