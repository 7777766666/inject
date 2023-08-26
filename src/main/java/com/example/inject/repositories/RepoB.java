package com.example.inject.repositories;

import com.example.inject.entites.B;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoB extends JpaRepository<B, Integer> {


}
