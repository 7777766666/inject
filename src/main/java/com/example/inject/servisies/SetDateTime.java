package com.example.inject.servisies;

import com.example.inject.entites.BaseAAndB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class SetDateTime <T extends BaseAAndB> {


    public T setCreationDateTime(T entity){
        entity.setCreateDate(LocalDateTime.now());
        return entity;
    }
}
