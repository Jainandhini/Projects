package com.spendthrift.db;

import com.spendthrift.model.Expense;

public interface UserTransactionDB {

	public int addExpense(Expense e);
	//public int removeExpense(Expense e);
	//public int updateExpense(Expense e);
}
