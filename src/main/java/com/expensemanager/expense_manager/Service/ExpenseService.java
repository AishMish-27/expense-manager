package com.expensemanager.expense_manager.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.expensemanager.expense_manager.Entity.Expense;
import com.expensemanager.expense_manager.Repository.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;

	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	public Expense createExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	public List<Expense> getAllExpenses() {
		return expenseRepository.findAll();
	}

	public Expense getExpenseById(Long id) {
		return expenseRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Expense not found with id: " + id));
	}

	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
}
