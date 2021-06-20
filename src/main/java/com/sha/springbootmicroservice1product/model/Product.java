package com.sha.springbootmicroservice1product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Long id;


    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name="price", nullable=false)
    private Double price;

    @Column(name="create_time", nullable = false)
    private LocalDateTime createTime;
}
