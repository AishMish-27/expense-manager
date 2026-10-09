package com.expensemanager.expense_manager.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record ExpenseRequest(
		@NotNull @Positive BigDecimal amount,
		@NotBlank @Size(max = 255) String category,
		@Size(max = 255) String description,
		@NotNull LocalDate expenseDate) {}
