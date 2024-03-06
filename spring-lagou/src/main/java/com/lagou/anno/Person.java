package com.lagou.anno;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author pxl
 * @date 2024/2/23
 * @apiNote
 */
@Component
public class Person {

	public Person() {
		System.out.println("Person 执行构造函数");
	}

	@Transactional
	public void testTransfer() {
		System.out.println("执行事务");
	}
}
