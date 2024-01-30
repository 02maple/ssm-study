package com.maple.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.maple.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试数据");
        book.setName("测试数据");
        book.setDescription("测试数据");
        bookService.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(4);
        book.setType("测试数据12");
        book.setName("测试数据12");
        book.setDescription("测试数据12");
        bookService.updateById(book);
    }

    @Test
    void testDelete() {
        bookService.removeById(5);
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.list());
    }

    @Test
    void testGetPage() {
        IPage<Book> page = new Page<Book>(1,2);
        bookService.page(page);
        System.out.println(page.getRecords());
    }
}
