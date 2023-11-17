package com.complaint.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complaint.entity.Tickets;

@Repository
public interface TicketsReposatory extends JpaRepository<Tickets, Long> {

}
