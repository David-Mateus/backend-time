package com.example.crud.dtos;

import jakarta.validation.constraints.NotBlank;

public record TimesRecordDto(@NotBlank String name, @NotBlank String time, @NotBlank String textComent) {

}
