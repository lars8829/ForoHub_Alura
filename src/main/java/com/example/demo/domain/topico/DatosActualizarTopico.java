package com.example.demo.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje,
        Boolean activo,
        String usuario,
        String curso
) {
}
