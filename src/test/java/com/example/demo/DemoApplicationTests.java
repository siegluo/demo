package com.example.demo;

import org.easymock.EasyMock;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Set up before class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Set up");
	}

	@Test
	public void testMathPow() {
		System.out.println("Test Math.pow");
		Assert.assertEquals(4.0, Math.pow(2.0, 2.0), 0.0);
	}

	@Test
	public void testMathMin() {
		System.out.println("Test Math.min");
		Assert.assertEquals(2.0, Math.min(2.0, 4.0), 0.0);
	}

	// 期望此方法抛出NullPointerException异常
	@Test(expected = NullPointerException.class)
	public void testException() {
		System.out.println("Test exception");
		Object obj = null;
		obj.toString();
	}

	// 忽略此测试方法
	@Ignore
	@Test
	public void testMathMax() {
		Assert.fail("没有实现");
	}
	// 使用“假设”来忽略测试方法
	@Test
	public void testAssume(){
		System.out.println("Test assume");
		// 当假设失败时，则会停止运行，但这并不会意味测试方法失败。
		Assume.assumeTrue(false);
		Assert.fail("没有实现");
	}

	@Test
	public void testListInEasyMock() {
		List list = EasyMock.createMock(List.class);
		// 录制过程

		// 期望方法list.set(0,1)执行2次，返回null，不抛出异常
		expect1: EasyMock.expect(list.set(0, 1)).andReturn(null).times(2);
		// 期望方法list.set(0,1)执行1次，返回null，不抛出异常
		expect2: EasyMock.expect(list.set(0, 1)).andReturn(1);
		// 执行测试代码
		EasyMock.replay(list);
		// 执行list.set(0,1)，匹配expect1期望，会返回null
		Assert.assertNull(list.set(0, 1));
		// 执行list.set(0,1)，匹配expect1（因为expect1期望执行此方法2次），会返回null
		Assert.assertNull(list.set(0, 1));
		// 执行list.set(0,1)，匹配expect2，会返回1
		Assert.assertEquals(1, list.set(0, 1));

		// 验证期望
		EasyMock.verify(list);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear down");
	}

	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("Tear down After class");
	}

}
