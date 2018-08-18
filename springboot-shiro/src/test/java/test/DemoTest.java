package test;

import java.util.UUID;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test1() {
		System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
	}
}
