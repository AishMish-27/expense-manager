package com.expensemanager.expense_manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.expensemanager.expense_manager.Entity.Expense;
import com.expensemanager.expense_manager.Entity.User;
import com.expensemanager.expense_manager.Repository.ExpenseRepository;
import com.expensemanager.expense_manager.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class ExpenseManagerApplicationTests {
	@Autowired
	private ExpenseRepository expenseRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	void saveExpense() {

		User user = userRepository.findById(2L)
				.orElseThrow(() -> new RuntimeException("User not found"));

		Expense expense = new Expense();

		expense.setAmount(new BigDecimal("500.00"));
		expense.setCategory("Food");
		expense.setDescription("Lunch");
		expense.setExpenseDate(LocalDate.now());
		expense.setCreatedAt(LocalDateTime.now());
		expense.setUser(user);

		Expense savedExpense = expenseRepository.save(expense);

		System.out.println("Saved Expense ID: " + savedExpense.getId());
	}

}
