package com.victor.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
	
}
