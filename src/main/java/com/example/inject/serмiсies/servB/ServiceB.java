package com.example.inject.serмiсies.servB;

import com.example.inject.entites.B;

public interface ServiceB {


    B findByIdB(Integer id);

    String saveB(Integer value);

    Integer getLastB();
}
