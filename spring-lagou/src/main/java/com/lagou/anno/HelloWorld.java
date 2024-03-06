package com.lagou.anno;

import org.springframework.stereotype.Component;

public class HelloWorld {

	public HelloWorld() {
		System.out.println("HelloWorld 执行构造函数");
	}

	public void sayHello() {
		System.out.println("Hello, world!");
	}
}
