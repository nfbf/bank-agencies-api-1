package com.bank.agencies.endpoint;

import com.bank.agencies.domain.Agency;
import com.bank.agencies.usecase.FindAllBBAgenciesUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/agencies", produces = MediaType.APPLICATION_JSON_VALUE)
public class AgenciesController {

    private final FindAllBBAgenciesUseCase findAllBBAgenciesUseCase;

    public AgenciesController(FindAllBBAgenciesUseCase findAllBBAgenciesUseCase) {
        this.findAllBBAgenciesUseCase = findAllBBAgenciesUseCase;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Agency>> findAllBBAgencies() {

        List<Agency> agencies = findAllBBAgenciesUseCase.execute();

        return new ResponseEntity<>(agencies, HttpStatus.OK);
    }
}
