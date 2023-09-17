package com.maple.service;

import com.maple.config.SpringConfig;
import com.maple.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetByid(){
        Book book = bookService.getId(1);
        System.out.println(book);
    }
}
