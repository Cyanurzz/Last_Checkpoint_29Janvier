package com.wildCheckpoint.cyanurzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildCheckpoint.cyanurzz.entity.Spectacle;


@Repository
public interface SpectacleRepository extends JpaRepository<Spectacle, Integer>{

}
