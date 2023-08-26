package com.example.inject.serмiсies.servA;

import com.example.inject.entites.A;
import org.springframework.stereotype.Service;

@Service
public interface ServiceA {

    A findByIdA(Integer id);
    String saveA(Integer value);

    Integer getLastA();
    String deleteA(Integer id);


}
