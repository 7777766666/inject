package com.example.inject.serмiсies.servA;

import com.example.inject.entites.A;
import com.example.inject.repositories.RepoA;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
//@AllArgsConstructor
public class ServAImpl implements ServiceA{

    private final RepoA repoA;

    @Autowired(required = true)
    public ServAImpl(RepoA repoA) {
        this.repoA = repoA;
    }


    @Override
    @Transactional(readOnly = true)
    public A findByIdA(Integer id) {
        return repoA.findById(id)
                .orElseThrow(
                        () -> new EntityNotFoundException(id + "  was not found int table A")
                );

    }

    @Override
    @Transactional
    public String saveA(Integer value) {
        A saveNewA = repoA.save(new A(value));
        return "new A class " + saveNewA.getId() + " with value = " + value;

    }

    @Override
    public Integer getLastA() {
        return null;
    }

    @Override
    public String deleteA(Integer id) {
        A byIdA = findByIdA(id);
        repoA.delete(byIdA);
        return "now A with id =" + id + " absent in DataBase";
    }
}
