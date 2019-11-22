package cn.test3.netty;

public class NettyOioServer {
    // public void server(int port) throws Exception {
    //     final ByteBuf buf = Unpooled.unreleasableBuffer(Unpooled.copiedBuffer("Hi!\tupe\n", Charset.forName("UTF-8")));
    //     EventLoopGroup group = new OioEventLoopGroup();
    //     try {
    //         //1创建一个 ServerBootstrap
    //         ServerBootstrap b = new ServerBootstrap();
    //         //2使用 OioEventLoopGroup 允许阻塞模式
    //         b.group(group)
    //                 .channel(OioServerSocketChannel.class)
    //                 .localAddress(new InetSocketAddress(port))
    //                 //3指定 ChannelInitializer 将给每个接受的连接调用
    //                 .childHandler(new ChannelInitializer<SocketChannel>() {
    //                     @Override
    //                     public void initChannel(SocketChannel ch)
    //                             throws Exception {
    //                         //4添加的 ChannelHandler 拦截事件，并允许他们作出反应
    //                         ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
    //                             @Override
    //                             public void channelActive(ChannelHandlerContext ctx) throws Exception {
    //                                 //5写信息到客户端，并添加 ChannelFutureListener 当一旦消息写入就关闭连接
    //                                 ctx.writeAndFlush(buf.duplicate()).addListener(ChannelFutureListener.CLOSE);
    //                             }
    //                         });
    //                     }
    //                 });
    //         //6绑定服务器来接受连接
    //         ChannelFuture f = b.bind().sync();
    //         f.channel().closeFuture().sync();
    //     } finally {
    //         //7释放所有资源
    //         group.shutdownGracefully().sync();
    //     }
    // }
}