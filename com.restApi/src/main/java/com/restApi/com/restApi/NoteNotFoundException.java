package com.restApi.com.restApi;

class NoteNotFoundException extends RuntimeException {

    NoteNotFoundException(Long id) {
        super("Could not find Note requested" + id);
    }
}
