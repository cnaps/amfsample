package com.example.amf.domain.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private Author author;
}
