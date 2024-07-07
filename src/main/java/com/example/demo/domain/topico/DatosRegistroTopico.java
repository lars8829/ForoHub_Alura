package com.example.demo.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DatosRegistroTopico(

        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fechaCreacion,

        Boolean activo,
        @NotBlank
        String usuario,
        @NotBlank
        String curso
) {


}
