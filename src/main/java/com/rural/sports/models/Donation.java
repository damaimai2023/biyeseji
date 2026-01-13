package com.rural.sports.models;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "donations")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String materialType;
    
    @Column(name = "`condition`")
    private String condition;
    
    private String status; // PENDING, APPROVED, REJECTED

    @ManyToOne
    @JoinColumn(name = "donator_id")
    private User donator;
}
