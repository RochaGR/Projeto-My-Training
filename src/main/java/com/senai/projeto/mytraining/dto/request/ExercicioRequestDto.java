package com.senai.projeto.mytraining.dto.request;

import java.time.LocalTime;

public record ExercicioRequestDto (

        String nome,
        String descricao,
        Double peso,
        LocalTime tempo

) {
}
