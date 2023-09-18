package com.maple.service.impl;

import com.maple.controller.Code;
import com.maple.dao.BookDao;
import com.maple.domain.Book;
import com.maple.exception.BusinessException;
import com.maple.exception.SystemException;
import com.maple.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getId(Integer id) {
        return bookDao.getId(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
