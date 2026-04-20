package com.rogerlacerda.usuarios.infrastructure.exceptions;

public class ConflictException extends RuntimeException {
    public ConflictException(String messagem) {
        super(messagem);
    }
    public ConflictException(String messagem, Throwable throwable) {
        super(messagem);
    }
}
