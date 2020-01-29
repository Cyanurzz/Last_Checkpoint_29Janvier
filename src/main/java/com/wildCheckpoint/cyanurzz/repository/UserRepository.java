package com.wildCheckpoint.cyanurzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildCheckpoint.cyanurzz.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
