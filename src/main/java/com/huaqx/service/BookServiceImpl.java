package com.huaqx.service;

import com.huaqx.mapper.BookMapper;
import com.huaqx.pojo.*;
import com.huaqx.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int addBook(BookDetail book) {
        int i = bookMapper.addBook(book);
        return i;
    }

    @Override
    public ArrayList<BookSnapshot> getRandom8Books() {
        ArrayList<BookSnapshot> random8Books = bookMapper.getRandom8Books();
        return random8Books;
    }

    @Override
    public ArrayList<BookSnapshot> getBookSnapshotsByKey(String key, int pageNow, String refer,int PageSize) {
        ArrayList<BookSnapshot> bookSnapshotsByKey = bookMapper.getBookSnapshotsByKey(key, pageNow, refer, PageSize);
        return bookSnapshotsByKey;
    }

    @Override
    public ArrayList<BookSnapshot> getBookSnapshotsByType(String type, int pageNow, String refer,int PageSize) {
        ArrayList<BookSnapshot> bookSnapshotsByType = bookMapper.getBookSnapshotsByType(type, pageNow, refer, PageSize);
        return bookSnapshotsByType;
    }

    @Override
    public BookDetail getBookDetailById(int bid) {
        BookDetail bookDetail = bookMapper.getBookDetailById(bid);
        return bookDetail;
    }

    @Override
    public ArrayList<BookComment> getBookCommentByIdAndPage(int Bid, int pageNow) {
        return null;
    }

    @Override
    public ArrayList<BookTradeRecord> getBookTradeRecordByIdAndPage(int Bid, int pageNow) {
        return null;
    }

    @Override
    public ArrayList<BookInCart> getBookInCartBySid(int Sid){
        return bookMapper.getBookInCartBySid(Sid);
    }


    @Override
    public void  delBookByBid(int Bid){
        bookMapper.delBookByBid(Bid);
    }

    @Override
    public void  updateBookDetail(BookDetail bookDetail){
        bookMapper.updateBookDetail(bookDetail);
    }

    @Override
    public void AddSaledNum(int oid) {

    }

    @Override
    public void incCommentNum(int bid) {

    }
    //??????key??????snapshot????????????????????????
    public int getBookSnapshotsPageCountByKey(String key){
        int rowCount = bookMapper.getBookSnapshotsPageCountByKey(key);
       return getPageCount(rowCount, Define.bookSnapshotPageSize);
    }

    //??????type??????snapshot????????????????????????
    public int getBookSnapshotsPageCountByType(String type){
        int rowCount = bookMapper.getBookSnapshotsPageCountByType(type);
        return getPageCount(rowCount, Define.bookSnapshotPageSize);
    }

    //???????????????rowCount???pageSize?????????????????????????????????
    public int getPageCount(int rowCount,int pageSize){

        if (rowCount % pageSize== 0) //????????????
            return rowCount / pageSize;
        else
            return rowCount / pageSize + 1;
    }

    public BookInCart getBookInCartByBid(int Bid){
        BookInCart bookInCartByBid = bookMapper.getBookInCartByBid(Bid);
        return bookInCartByBid;
    }
}
