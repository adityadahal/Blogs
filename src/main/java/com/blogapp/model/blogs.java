package com.blogapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "blogs")

public class blogs {
    @Id
    @Column
    @GeneratedValue
    private  int id;

    @Column
    String title;

    @Column
    String description;
}
