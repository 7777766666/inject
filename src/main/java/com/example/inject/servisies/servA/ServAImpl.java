package com.example.inject.servisies.servA;

import com.example.inject.entites.A;
import com.example.inject.repositories.RepoA;
import com.example.inject.servisies.SetDateTime;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ServAImpl implements ServiceA{

    private final RepoA repoA;
    private final SetDateTime<A> setDateTime;
    private final EntityManager entityManager;

    @Override
    @Transactional
    public String saveA(Integer value) {

        A a1 = new A();
        a1.setX(value);
        var a2 = setDateTime.setCreationDateTime(a1);
        var a = repoA.saveAndFlush(a2);


        entityManager.flush();
        entityManager.close();

        return "new A class " + a.getId() + " with value = " + value + " create dateTime " + a.getCreateDate();

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
