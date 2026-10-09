package com.expensemanager.expense_manager.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.expensemanager.expense_manager.DTO.ExpenseRequest;
import com.expensemanager.expense_manager.DTO.ExpenseResponse;
import com.expensemanager.expense_manager.Entity.Expense;
import com.expensemanager.expense_manager.Repository.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;

	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	public ExpenseResponse createExpense(ExpenseRequest request) {
		Expense expense = toEntity(request);
		Expense savedExpense = expenseRepository.save(expense);
		return toResponse(savedExpense);
	}

	public List<ExpenseResponse> getAllExpenses() {
		List<Expense> list = expenseRepository.findAll();
		List<ExpenseResponse> responses = new ArrayList<>();
		for(Expense exp : list){
			responses.add(toResponse(exp));
		}

		return responses;

//		return expenseRepository.findAll().stream()
//				.map(this::toResponse)
//				.toList();
	}

	public ExpenseResponse getExpenseById(Long id) {
		Expense expense = expenseRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Expense not found with id: " + id));
		return toResponse(expense);
	}

	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}

	private Expense toEntity(ExpenseRequest request) {
		Expense expense = new Expense();
		expense.setAmount(request.amount());
		expense.setCategory(request.category());
		expense.setDescription(request.description());
		expense.setExpenseDate(request.expenseDate());

		return expense;
	}

	private ExpenseResponse toResponse(Expense expense) {
		return new ExpenseResponse(
				expense.getId(),
				expense.getAmount(),
				expense.getCategory(),
				expense.getDescription(),
				expense.getExpenseDate(),
				expense.getCreatedAt());
	}
}
