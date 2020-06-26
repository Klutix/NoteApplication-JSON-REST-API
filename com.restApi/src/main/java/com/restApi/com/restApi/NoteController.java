package com.restApi.com.restApi;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
class NoteController {

    private final NoteRepository repository;

    NoteController(NoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/notes")
    List<Note> all(@RequestParam(required = false) String query) {
        if(query == null) {
            return repository.findAll();
        }else{
            return repository.findNotesWith("%"+query+"%");
        }
    }

    @PostMapping(path = "/api/notes",produces = "application/json;charset=UTF-8")
    Note newNote(@RequestBody Note note) {
        return repository.save(note);
    }

    @GetMapping("/api/notes/{id}")
    Note one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new NoteNotFoundException(id));
    }

    @PutMapping("/api/notes/{id}")
    Note replaceNote(@RequestBody Note newNote, @PathVariable Long id) {

        return repository.findById(id)
                .map(note -> {
                    note.setName(newNote.getBody());

                    return repository.save(note);
                })
                .orElseGet(() -> {
                    newNote.setId(id);
                    return repository.save(newNote);
                });
    }

    @DeleteMapping("/api/notes/{id}")
    void deleteNote(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
