package com.logant.BankAccountManagementSystem.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
        @Query("SELECT u FROM User u LEFT JOIN FETCH u.accounts")
        List<User> findAllWithAccounts();
}