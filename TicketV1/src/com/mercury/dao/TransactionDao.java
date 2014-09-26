package com.mercury.dao;

import java.util.List;
import com.mercury.beans.Transactions;

public interface TransactionDao {
	public void save(Transactions transaction);
	public List<Transactions> query();
	public void delete(Transactions transaction);
	public void update(Transactions transaction);
}
