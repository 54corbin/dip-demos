namespace java com.chb
struct Message {
     1: string text
}

service EchoService{
    Message echo(1: Message msg)
}