package com.example.hotelmanagement.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomDTO {
    private Long id;
    private String title;
    private String description;
    private int capacity;
    private double price;
    private String image;
    private boolean available;
}
