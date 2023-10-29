package com.thiagodd.pedidocertoapi.domain.model;

import com.thiagodd.pedidocertoapi.domain.model.enumerated.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "orders")
public class Order extends BaseEntityAudit{

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "shipping_rate")
    private BigDecimal shippingRate;

    @Column(name = "subtotal")
    private BigDecimal subtotal;

    @Embedded
    private Address deliveryAddress;

    @Column(name = "confirmation_date")
    private Instant confirmationDate;

    @Column(name = "cancellation_date")
    private Instant cancellationDate;

    @Column(name = "delivery_date")
    private Instant deliveryDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Restaurant restaurant;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> items = new ArrayList<>();
}
