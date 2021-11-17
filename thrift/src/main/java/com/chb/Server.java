package com.chb;

import org.apache.thrift.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;

/**
 * Server
 */
public class Server {

    public static void main(String[] args) throws TTransportException{

        start();

    }

    public static void start() throws TTransportException {
        TServerTransport serverTransport = new TServerSocket(9527);
        TSimpleServer ser = new TSimpleServer(new TServer.Args(serverTransport)
                .processor(new EchoService.Processor<>(new EchoServiceImpl())));

        System.out.print("Starting the server... ");

        ser.serve();

        System.out.println("done.");
    }

}
