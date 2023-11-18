package com.example.inject.entites;

import jakarta.persistence.Transient;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Data
public class BaseAAndB {

    @Transient()
    private LocalDateTime createDate;
}
