package com.babyduncan.thrift.client;

import com.babyduncan.thrift.service.BookService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * User: guohaozhao (guohaozhao@sohu-inc.com)
 * Date: 13-8-9 17:40
 */
public class BookClient {

    public static void main(String... args) throws Exception {
        TTransport transport = new TFramedTransport(new TSocket("localhost", 10000));
        transport.open();
        TProtocol protocol = new TBinaryProtocol(transport);
        BookService.Client client = new BookService.Client(protocol);
        System.out.println(client.getBook(123));

    }

}
