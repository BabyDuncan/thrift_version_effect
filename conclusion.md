### 结论:

对于客户端与服务端 model版本不一致的情况,thrift的处理办法如下:

    1,如果客户端比服务端的model 多属性,那么到服务端丢弃多加的属性,然后正常处理.
    2,如果客户端比服务端少属性,则在服务端把此属性置为默认,处理之后,返回给客户端的时候,丢弃该属性.
