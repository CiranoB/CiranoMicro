package com.gftstart.bookkeeperservice.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gftstart.bookkeeperservice.model.Pay;

@Repository
public interface PayRepository extends JpaRepository<Pay, UUID>{

	public Optional<Pay> findByUuidPersonPay(String uuidPersonPay);
	

	
}
