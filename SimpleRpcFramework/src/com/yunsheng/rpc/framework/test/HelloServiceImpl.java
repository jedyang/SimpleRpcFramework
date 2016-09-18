package com.yunsheng.rpc.framework.test;

public class HelloServiceImpl implements HelloService {

	@Override
	public String Hello(String name) {
		return "Hello " + name;
	}

}
