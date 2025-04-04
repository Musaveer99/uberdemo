package com.project.uber.uberApp.enitities;

import com.project.uber.uberApp.enitities.enums.TransactionMethod;
import com.project.uber.uberApp.enitities.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
public class WalletTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Double amount;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    private String transactionId;

    @OneToOne
    private Ride ride;

    @ManyToOne
    private Wallet wallet;

    private LocalDateTime timestamp;
}
