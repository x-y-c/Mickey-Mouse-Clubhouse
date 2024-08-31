package com.xyc.im.codec;

public class MessageDecoder extends ByteToMessageDecoder{
    @Override
    protected void decode(ChannelHandlerContext ctx,
                          ByteBuf in, List<Object> out) throws Exception {
        //请求头（指令
        // 版本
        // clientType
        // 消息解析类型
        // appId
        // imei长度
        // bodylen）+ imei号 + 请求体

        if(in.readableBytes() < 28){
            return;
        }

        Message message = ByteBufToMessageUtils.transition(in);
        if(message == null){
            return;
        }

        out.add(message);
    }
}
