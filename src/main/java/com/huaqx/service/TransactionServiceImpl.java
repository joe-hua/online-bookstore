package com.huaqx.service;

import com.huaqx.mapper.TransactionMapper;
import com.huaqx.pojo.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl  implements TransactionService{

    @Autowired
    TransactionMapper transactionMapper;

    @Override
    public void addTrade(Transaction transactionBean) {
        transactionMapper.addTrade(transactionBean);
    }
}
