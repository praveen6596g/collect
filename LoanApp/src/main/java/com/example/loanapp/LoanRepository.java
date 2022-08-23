package com.example.loanapp;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LoanRepository extends JpaRepository<LoanEntity,Integer> {
	

}