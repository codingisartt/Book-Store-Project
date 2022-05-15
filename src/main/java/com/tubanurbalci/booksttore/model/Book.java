package com.tubanurbalci.booksttore.model;

import lombok.*;

import javax.persistence.*;

@Data
@Table
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity //Persistent entity 'Book' should have primary key

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String author;
    private Double price;
    private Integer stock;
}
