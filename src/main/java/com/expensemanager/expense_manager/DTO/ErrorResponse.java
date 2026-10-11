package com.expensemanager.expense_manager.DTO;

import java.util.Map;

public record ErrorResponse(
        int status,
        String message,
        Map<String, String> errors
) {}
