package com.expensemanager.expense_manager.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensemanager.expense_manager.Entity.Expense;
import com.expensemanager.expense_manager.Service.ExpenseService;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

	private final ExpenseService expenseService;

	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}

	@PostMapping
	public ResponseEntity<Expense> createExpense(@RequestBody Expense expense) {
		Expense createdExpense = expenseService.createExpense(expense);

		return new ResponseEntity<>(createdExpense, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Expense>> getAllExpenses() {
		List<Expense> expenses = expenseService.getAllExpenses();

		return new ResponseEntity<>(expenses,HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Expense> getExpenseById(@PathVariable Long id) {
		Expense expense = expenseService.getExpenseById(id);

		return new ResponseEntity<>(expense,HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteExpense(@PathVariable Long id) {
		expenseService.deleteExpense(id);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}