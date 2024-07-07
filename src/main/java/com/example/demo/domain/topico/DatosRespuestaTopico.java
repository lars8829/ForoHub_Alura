package com.example.demo.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(

        Long id,

        String titulo,

        String mensaje,

        String fechaCreacion,

        Boolean activo,

        String usuario,

        String curso

) {
}
