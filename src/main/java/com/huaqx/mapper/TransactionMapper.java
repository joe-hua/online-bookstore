package com.huaqx.mapper;

import com.huaqx.pojo.Transaction;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TransactionMapper {

    public void addTrade(Transaction transactionBean);

}
