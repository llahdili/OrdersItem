package com.ortest.model;

import com.ortest.mapstruct.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Products extends ProductDTO {
        @Id
        @GeneratedValue(strategy = AUTO)
        private long id;
        private String name;
        private float unitPrice;
        private int unitsInStock;
}
