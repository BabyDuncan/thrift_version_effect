package com.babyduncan.thrift.client.async;

import com.babyduncan.thrift.service.BookService;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.*;

/**
 * User: guohaozhao (guohaozhao@sohu-inc.com)
 * Date: 13-8-12 10:28
 */
public class BookClientAsync {

    public static void main(String... args) throws Exception {
        TNonblockingTransport transport = new TNonblockingSocket("localhost", 10000);
        TAsyncClientManager clientManager = new TAsyncClientManager();
        TProtocolFactory protocol = new TBinaryProtocol.Factory();
        BookService.AsyncClient client = new BookService.AsyncClient(protocol, clientManager, transport);
        CallbackHandler callbackHandler = new CallbackHandler();
        client.getBook(123, callbackHandler);
        Thread.sleep(3000);
    }

}
