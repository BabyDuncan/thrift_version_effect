package com.babyduncan.thrift.server;

import com.babyduncan.thrift.service.BookService;
import com.babyduncan.thrift.service.internal.BookServiceImpl;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;

/**
 * User: guohaozhao (guohaozhao@sohu-inc.com)
 * Date: 13-8-12 10:20
 */
public class BookServerAsync {

    public static void main(String... args) throws Exception {
        TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(10000);
        BookService.Processor processor = new BookService.Processor(new BookServiceImpl());
        TServer server = new THsHaServer(new THsHaServer.Args(serverTransport).processor(processor));
        server.serve();
    }

}
