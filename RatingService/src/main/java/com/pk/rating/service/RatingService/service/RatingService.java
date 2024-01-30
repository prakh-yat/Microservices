package com.pk.rating.service.RatingService.service;

import com.pk.rating.service.RatingService.entity.Rating;

import java.util.List;


public interface RatingService {
    Rating create (Rating rating);

    List<Rating> getRatings();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);


}
