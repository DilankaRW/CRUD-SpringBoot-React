package com.codewithdilanka.fullstackbackend.repository;

//import org.apache.catalina.User;
import com.codewithdilanka.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}