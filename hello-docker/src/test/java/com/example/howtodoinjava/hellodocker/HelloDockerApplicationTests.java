package com.example.howtodoinjava.hellodocker;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloDockerApplicationTests {

	@Test
	public void UnPlusUn() {
		Assert.assertTrue((1+1) == 2);
	}

	@Test
	public void UnPlusDeux() {
		Assert.assertTrue((1+2) == 3);
	}

}
