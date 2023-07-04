package com.example.todo4juli.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "todo_items" )
public class TodoItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    private Boolean IsComplete;

    private Instant CreatedAt;

    private Instant updatedAt;

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", IsComplete=" + IsComplete +
                ", CreatedAt=" + CreatedAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
