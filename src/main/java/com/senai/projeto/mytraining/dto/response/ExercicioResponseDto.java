package com.senai.projeto.mytraining.dto.response;

import java.time.LocalTime;

public record ExercicioResponseDto(

        Long id,

        String nome,

        String descricao,

        Double peso,

        LocalTime tempo
){
}
