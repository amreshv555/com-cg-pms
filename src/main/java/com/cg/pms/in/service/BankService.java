package com.cg.pms.in.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pms.in.exception.BankAlreadyExistsException;
import com.cg.pms.in.exception.BankDoesNotExistsException;
import com.cg.pms.in.model.BankDetails;
import com.cg.pms.in.repository.IBankRepository;

@Service
public class BankService implements IBankService{
	
	private static final Logger LOG = LoggerFactory.getLogger(BankService.class);
	
	@Autowired
	private IBankRepository bankRepo;
	
	public BankDetails getBankDeatils(Long accno) {
		LOG.info("getBankDetailsById");
		Optional<BankDetails> bankOpt = bankRepo.findById(accno);
		if (bankOpt.isPresent()) {
			LOG.info("bank Details get successfully");
			return bankOpt.get();
		} else {
			LOG.info("Bank does not exists");
			throw new BankDoesNotExistsException("Bank does not exists");
		}
	}
	
	public BankDetails addBankDeatils(BankDetails bankDetails) {
		LOG.info("addBankDeatils");
		if(!bankRepo.existsById(bankDetails.getAccno())){
			LOG.info("Bank Details added successfully");
			return bankRepo.save(bankDetails);
		}
		else {
			LOG.info("This bank already exist in the database");
		throw new BankAlreadyExistsException("This bank already exists in the database");
		}
	}
	
	public BankDetails updateBankDeatils(BankDetails bankDetails) {
		LOG.info("updateBankDeatils");
		if(bankRepo.existsById(bankDetails.getAccno())){
			LOG.info("Bank Details update successfully");
			return bankRepo.save(bankDetails);
		}
		else {
			LOG.info("This bank already exist in the database");
		throw new BankDoesNotExistsException("This bank already exists in the database");
		}
	}

	public void deleteBankDeatils(Long accno) {
		LOG.info("deleteBankDeatils");
		if(bankRepo.findById(accno) != null){
			LOG.info("Bank Details added successfully");
		    bankRepo.deleteById(accno);
		}
		else {
			LOG.info("This bank already exist in the database");
		throw new BankDoesNotExistsException("This bank already exists in the database");
		}
	}

	
}
