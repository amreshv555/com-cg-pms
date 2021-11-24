package com.cg.pms.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.pms.in.model.BankDetails;

@Repository
public interface IBankRepository extends JpaRepository<BankDetails, Long>{

	

}
