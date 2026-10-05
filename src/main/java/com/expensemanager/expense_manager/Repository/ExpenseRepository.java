package com.expensemanager.expense_manager.Repository;

import com.expensemanager.expense_manager.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
