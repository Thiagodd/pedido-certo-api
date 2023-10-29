package com.thiagodd.pedidocertoapi.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "payment_method")
public class PaymentMethod extends BaseEntity{

    private String description;
}
