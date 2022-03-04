package com.example.lunch.repository;

import com.example.lunch.entity.complaint.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint,Long>, AbstractRepository {
}
