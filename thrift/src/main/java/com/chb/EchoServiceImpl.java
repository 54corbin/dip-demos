package com.chb;

public class EchoServiceImpl implements EchoService.Iface{

    public Message echo(Message msg) throws org.apache.thrift.TException{
        return msg;

    }

}
