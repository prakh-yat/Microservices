package com.pk.hotel.service.HotelService.repository;

import com.pk.hotel.service.HotelService.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}
