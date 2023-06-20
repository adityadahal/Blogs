package com.blogapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
   private String title;
   private String description;
}
