package com.microservices.microservices.service;

import com.microservices.microservices.dto.LimitRequest;
import com.microservices.microservices.dto.LimitResponse;
import com.microservices.microservices.model.Limits;
import com.microservices.microservices.repository.LimitsRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class LimitService {

    private final LimitsRepository limitsRepository;
    public void createLimit(LimitRequest limitRequest) {

        //transforma o dto em limite
        Limits limits = Limits.builder()
                .maximum(limitRequest.getMaximum())
                .minimum(limitRequest.getMinimum())
                .build();


        //salva o limite na bd
        limitsRepository.save(limits);

        //ocasionalmente posso adicionar logs
    }

    public List<LimitResponse> getallLimits(){
        List<Limits> limits = limitsRepository.findAll();// pega todos os limites que vem da db

      return  limits.stream().map(this:: mapToLimitResponse).toList(); //mapeia para eles terem todos os dados e retorna


    }

    private LimitResponse mapToLimitResponse(Limits limits) {
        return LimitResponse.builder()
                .id(limits.getId())
                .minimum(limits.getMinimum())
                .maximum(limits.getMaximum())
                .build();

    }
}
