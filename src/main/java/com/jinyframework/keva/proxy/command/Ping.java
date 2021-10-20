package com.jinyframework.keva.proxy.command;

import com.jinyframework.keva.proxy.util.ContextUtils;
import io.netty.channel.ChannelHandlerContext;

public class Ping implements CommandHandler {
    @Override
    public void handle(ChannelHandlerContext ctx, String line) {
        ContextUtils.write(ctx, "PONG");
    }
}
