import com.lagou.anno.HelloWorld;
import com.lagou.anno.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationControllerTest {

	@Test
	public void runTest() {
		// 创建一个Spring应用上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.lagou.anno");

		// 获取 Person Bean 并调用方法
		Person person = context.getBean(Person.class);
		person.say();

		// 关闭应用上下文
		context.close();
	}

}

