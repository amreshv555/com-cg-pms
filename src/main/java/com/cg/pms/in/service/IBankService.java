package com.cg.pms.in.service;

import com.cg.pms.in.model.BankDetails;

public interface IBankService {

	public BankDetails addBankDeatils(BankDetails bankDetails);
	public void deleteBankDeatils(Long accno);
}

