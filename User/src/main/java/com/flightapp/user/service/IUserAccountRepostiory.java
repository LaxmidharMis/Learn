package com.flightapp.user.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.user.entity.User;



public interface IUserAccountRepostiory extends JpaRepository<User, Long> {

}
