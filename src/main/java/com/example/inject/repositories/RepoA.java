package com.example.inject.repositories;

import com.example.inject.entites.A;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoA extends JpaRepository<A, Integer> {
}
