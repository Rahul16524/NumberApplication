package com.example.number.service;

import com.example.number.repository.NumberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberServiceImpl implements NumberService {

    private final NumberRepository numberRepository;

    public NumberServiceImpl(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
    }

    @Override
    public List<Integer> getNumbers() {
        return numberRepository.getNumbers();
    }
}
