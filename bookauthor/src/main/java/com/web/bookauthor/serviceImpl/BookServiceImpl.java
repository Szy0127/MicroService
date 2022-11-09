package com.web.bookauthor.serviceImpl;


import com.web.bookauthor.dao.BookDao;
import com.web.bookauthor.entity.Book;
import com.web.bookauthor.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Override
    public String getAuthorByName(String name) {
        return bookDao.getAuthorByName(name);
    }
}
