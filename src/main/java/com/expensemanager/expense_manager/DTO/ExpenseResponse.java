package com.expensemanager.expense_manager.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ExpenseResponse(
		Long id,
		BigDecimal amount,
		String category,
		String description,
		LocalDate expenseDate,
		LocalDateTime createdAt) {}
