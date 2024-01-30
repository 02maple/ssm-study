package com.maple.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.maple.domain.Book;

public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currentPage,int pageSize);
}
