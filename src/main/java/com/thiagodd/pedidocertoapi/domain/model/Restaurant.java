package com.thiagodd.pedidocertoapi.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "restaurant")
public class Restaurant extends BaseEntityAudit{

    private String name;

    @Column(name = "shipping_rate")
    private BigDecimal shippingRate;

    private Boolean active;

    private Boolean open;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "restaurant")
    private List<Product> products;

    @ManyToMany
    @JoinTable(
        name = "restaurant_payment_method",
        joinColumns = @JoinColumn(name = "restaurant_id"),
        inverseJoinColumns = @JoinColumn(name = "payment_method_id")
    )
    private Set<PaymentMethod> paymentMethods = new HashSet<>();
}
