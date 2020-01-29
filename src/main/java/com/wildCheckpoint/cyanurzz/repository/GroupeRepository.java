package com.wildCheckpoint.cyanurzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildCheckpoint.cyanurzz.entity.Groupe;


@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Integer>{

}
