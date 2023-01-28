package com.example.demo.manyToMany.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
    @ManyToMany
            (
                    fetch = FetchType.LAZY, mappedBy = "tags",
                    cascade = {CascadeType.PERSIST, CascadeType.MERGE}
            )
    @JsonIgnore
    private Set<Tutorial> tutorials = new HashSet<>();
}
