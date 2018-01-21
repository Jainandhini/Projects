package com.spendthrift.service;



import com.spendthrift.model.Expense;

public interface TransactionService {
	
	int addTransaction(Expense expense);
	
	int updateTransaction(Expense expense);
	
	Expense[] getTransaction(String date);
	
	Expense[] getAllTransactions();
}
