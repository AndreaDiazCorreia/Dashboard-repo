package com.dashboard.backend.dashboard.service.interfaces;

import com.dashboard.backend.dashboard.entities.GerenteDash;
import com.dashboard.backend.dashboard.exceptions.BadRequestException;
import com.dashboard.backend.dashboard.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface GerenteService {
    List<GerenteDash> listGerenteDash();
    GerenteDash addGerenteDash(GerenteDash gerenteDash) throws BadRequestException;
    Optional<GerenteDash> searchGerenteDashById(Integer id) throws ResourceNotFoundException;
    GerenteDash updateGerenteDash (GerenteDash gerenteDash) throws  ResourceNotFoundException, BadRequestException;
    void deleteGerenteDash (Integer id) throws ResourceNotFoundException;
}
