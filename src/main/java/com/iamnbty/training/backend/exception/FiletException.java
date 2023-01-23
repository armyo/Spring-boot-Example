package com.iamnbty.training.backend.exception;

public class FiletException extends BaseException {

    public FiletException(String code) {
        super("file." + code);
    }

    public static FiletException fileNull() {
        return new FiletException("null");
    }

    public static FiletException fileMaxSize() {
        return new FiletException("max.size");
    }

    public static FiletException unsupported() {
        return new FiletException("unsupported.file.type");
    }

}
