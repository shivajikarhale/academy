package com.success.academy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.success.models.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, String> {

}
