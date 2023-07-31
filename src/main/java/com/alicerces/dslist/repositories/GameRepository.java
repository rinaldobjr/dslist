package com.alicerces.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alicerces.dslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long>{

}
