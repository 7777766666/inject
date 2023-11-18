package com.example.inject.controllers;

import com.example.inject.servisies.servA.ServiceA;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ControllerA {

    private final ServiceA serviceA;

    @GetMapping("/new/{value}")
    public String savaACreateTime(@PathVariable(value = "value") Integer value) {
        return serviceA.saveA(value);
    }


    @PostMapping("/new/{value}")
    public String saveA(@PathVariable(value = "value") Integer value) {
        return serviceA.saveA(value);
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable(value = "id") Integer id) {
//        A byIdA = serviceA.findByIdA(id);
        return new String("id = " + serviceA.findByIdA(id).getId() + " value= " + serviceA.findByIdA(id).getX());
    }

    @DeleteMapping("/del/{id}")
    public String delete(@PathVariable(value = "id") Integer id) {
        return serviceA.deleteA(id);

    }


}
