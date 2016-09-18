package com.yunsheng.rpc.framework.test;

import com.yunsheng.rpc.framework.RpcFramework;

public class RpcConsumer {

	public static void main(String[] args) throws Exception {
		HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
		for(int i = 0;i<10 ;i++)
		{
			String result = service.Hello("yunsheng "+ i);
			System.out.println(result);
			Thread.sleep(1000);
		}
	}

}

