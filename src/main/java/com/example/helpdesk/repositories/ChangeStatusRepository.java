package com.example.helpdesk.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.helpdesk.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
}
