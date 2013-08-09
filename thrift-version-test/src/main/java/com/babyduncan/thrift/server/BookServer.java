package com.babyduncan.thrift.server;

import com.babyduncan.thrift.service.BookService;
import com.babyduncan.thrift.service.internal.BookServiceImpl;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * User: guohaozhao (guohaozhao@sohu-inc.com)
 * Date: 13-8-9 16:51
 */
public class BookServer {

    public static void main(String... args) throws TTransportException {
        TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(10000);
        BookService.Processor processor = new BookService.Processor(new BookServiceImpl());
        TServer server = new TNonblockingServer(new TNonblockingServer.Args(serverTransport).processor(processor));
        server.serve();
    }

}
