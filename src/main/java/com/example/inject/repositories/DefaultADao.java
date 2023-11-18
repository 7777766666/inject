package com.example.inject.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class DefaultADao implements ADao{
    @Override
    public String saveWithTime(Integer number) {
        return null;
    }
}
