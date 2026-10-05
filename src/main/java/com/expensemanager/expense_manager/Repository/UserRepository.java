package com.expensemanager.expense_manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensemanager.expense_manager.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
