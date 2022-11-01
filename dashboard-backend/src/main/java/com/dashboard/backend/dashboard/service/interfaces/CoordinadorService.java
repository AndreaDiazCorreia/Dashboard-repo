package com.dashboard.backend.dashboard.service.interfaces;

import com.dashboard.backend.dashboard.entities.CoordinadorDash;
import com.dashboard.backend.dashboard.exceptions.BadRequestException;
import com.dashboard.backend.dashboard.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface CoordinadorService {
    List<CoordinadorDash> listCoordinador();
    CoordinadorDash addCoordinador(CoordinadorDash coordinadorDash) throws BadRequestException;

    List<CoordinadorDash> listCoordinadorDash();

    CoordinadorDash addCoordinadorDash(CoordinadorDash coordinadorDash);

    Optional<CoordinadorDash> searchCoordinadorDashById(Integer id) throws ResourceNotFoundException;
    CoordinadorDash updateCoordinadorDash(CoordinadorDash coordinadorDash) throws ResourceNotFoundException, BadRequestException;
    void deleteCoordinadorDash(Integer id) throws ResourceNotFoundException;
}
