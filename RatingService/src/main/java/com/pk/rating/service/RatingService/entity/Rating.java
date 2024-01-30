package com.pk.rating.service.RatingService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name="ratings")
public class Rating {
    @Id
    private String Id;
    private String userId;
    private String hotelId;
    private int rating;
    private String remark;



}
