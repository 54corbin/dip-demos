package com.chb;

import org.apache.thrift.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;

/**
 * Server
 */
public class Client{

    public static void main(String[] args) throws TException{


        TTransport transport = new TSocket("localhost", 9527);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        EchoService.Client cli = new EchoService.Client(protocol);

        System.out.println("do rpc...");

        Message result = cli.echo( new Message("this is a test msg!"));

        transport.close();

        System.out.println("rpc done,result:"+result);
    }


}
