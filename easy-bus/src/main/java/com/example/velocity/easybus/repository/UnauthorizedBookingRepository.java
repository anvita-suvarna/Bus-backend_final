package com.example.velocity.easybus.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.velocity.easybus.model.UnauthorizedBooking;

public interface UnauthorizedBookingRepository extends MongoRepository<UnauthorizedBooking, String> {

}
