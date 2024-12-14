package com.example.hotelmanagement.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationDTO {
    private Long id;
    private Long userId;
    private String roomType;
    private LocalDate startDate;
    private LocalDate endDate;
    private int numberOfPeople;
    private double amount;
    private String paymentStatus;
}
