package com.babyduncan.thrift.service.internal;

import com.babyduncan.thrift.model.Book;
import com.babyduncan.thrift.service.BookService;
import org.apache.thrift.TException;

/**
 * User: guohaozhao (guohaozhao@sohu-inc.com)
 * Date: 13-8-9 16:41
 */
public class BookServiceImpl implements BookService.Iface {

    @Override
    public Book getBook(long id) throws TException {
        return new Book().setId(1).setName("好书一本").setPrice(100);
    }

    @Override
    public long saveBook(Book book) throws TException {
        return 0;
    }
}
