package com.tubanurbalci.booksttore.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Table
@Getter
@Setter
@Builder
@Entity(name = "bookOrder")
@AllArgsConstructor
@NoArgsConstructor
public class Order {


    @Id
    private Integer id;

    private String userName;

    @Column
    @ElementCollection(targetClass = Integer.class)
    private List<Integer> bookIdList;

    private Double totalPrice;


}
