package com.restApi.com.restApi;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Note {
    private @Id
    @GeneratedValue
    Long id;
    private String body;

    protected Note() {}
    Note(String body) {
        this.body = body;
    }
    public Long getId() {
        return this.id;
    }
    public String getBody() {
        return this.body;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Note))
            return false;
        Note note = (Note) o;
        return Objects.equals(this.id, note.id) && Objects.equals(this.body, note.body);
    }

    @Override
    public String toString() {
        return "Note{" + "id=" + this.id + ", name='" + this.body + '\'' + '}';
    }
}
