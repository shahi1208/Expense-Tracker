package com.project.expense_tracker.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ExpenseResponse (
    Long id,
    LocalDateTime createdAt,
    BigDecimal amount,
    String category,
    String description,
    LocalDate expenseDate,
    Long userId,
    String username
){}
