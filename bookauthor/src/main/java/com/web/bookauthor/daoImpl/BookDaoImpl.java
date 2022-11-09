package com.web.bookauthor.daoImpl;


import com.web.bookauthor.dao.BookDao;
import com.web.bookauthor.entity.Book;
import com.web.bookauthor.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public String getAuthorByName(String name) {
        List<Book> res = bookRepository.getBooksByName(name);
        if(res==null || res.isEmpty()){
            return "";
        }
        return res.get(0).getAuthor();
    }
}
