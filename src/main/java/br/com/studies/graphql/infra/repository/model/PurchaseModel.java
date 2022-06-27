package br.com.studies.graphql.infra.repository.model;

import br.com.studies.graphql.domain.enums.PurchaseStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "purchase")
public class PurchaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private PurchaseStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientModel client;

    @ManyToOne
    @JoinColumn(name= "product_id")
    private ProductModel product;

}
