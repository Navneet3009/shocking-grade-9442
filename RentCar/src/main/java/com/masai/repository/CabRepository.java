package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.entity.Cab;

@Repository
public interface CabRepository extends JpaRepository<Cab, Integer>{

	List<String> viewCarType();
	
	@Query("select distinct carType from Cab")
	public List<String> viewCarType();
}
