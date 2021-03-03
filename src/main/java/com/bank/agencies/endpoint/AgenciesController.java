    package com.bank.agencies.endpoint;

    import com.bank.agencies.domain.AgencyGatewayResponse;
    import com.bank.agencies.domain.AgencyResponse;
    import com.bank.agencies.usecase.FindAllAgenciesUseCase;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.MediaType;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

    @RestController
    @RequestMapping(value = "/agencies", produces = MediaType.APPLICATION_JSON_VALUE)
    public class AgenciesController {

        private final FindAllAgenciesUseCase findAllAgenciesUseCase;

        public AgenciesController(FindAllAgenciesUseCase findAllAgenciesUseCase) {
            this.findAllAgenciesUseCase = findAllAgenciesUseCase;
        }

        @GetMapping
        @ResponseStatus(HttpStatus.OK)
        public ResponseEntity<List<AgencyResponse>> findAllAgencies() {

            List<AgencyGatewayResponse> agencies = findAllAgenciesUseCase.execute();            
            List<AgencyResponse> agencyResponse = AgencyResponseDTO.getAllAgenciesResponse(agencies);
            
            return new ResponseEntity<>(agencyResponse, HttpStatus.OK);
        }
        
        @GetMapping("/by/state")
        @ResponseStatus(HttpStatus.OK)
        public ResponseEntity<Map<String, List<AgencyResponse>>> findAllAgenciesByState() {
            
            List<AgencyGatewayResponse> agencies = findAllAgenciesUseCase.execute();            
            Map<String,List<AgencyResponse>> agencyResponse = AgencyResponseDTO.getAllAgenciesByStateResponse(agencies);

            return new ResponseEntity<>(agencyResponse, HttpStatus.OK);
        }
    }
