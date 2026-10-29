package com.example.number.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NumberRepository {

    public List<Integer> getNumbers() {
        return List.of(10, 20, 30, 40, 50);
    }
}
