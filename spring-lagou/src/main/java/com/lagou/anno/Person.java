package com.lagou.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author pxl
 * @date 2024/2/23
 * @apiNote
 */
@Component
public class Person {

	@Autowired
	private HelloWorld helloWorld;

	public void say() {
		helloWorld.sayHello();
	}

}
