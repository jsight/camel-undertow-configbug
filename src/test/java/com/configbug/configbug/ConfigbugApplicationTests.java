package com.configbug.configbug;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest(classes = { ConfigbugApplication.class, ConfigClass.class })
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class ConfigbugApplicationTests {

	@Autowired
	private ConfigClass configClass;

	@Test
	void configBasic() {
		Assertions.assertNotNull(configClass.getHello());
	}

	@Test
	void testSet1() {
		Assertions.assertNotNull(configClass.getArgs());
		Assertions.assertEquals(7, configClass.getArgs().size());
		Assertions.assertTrue(configClass.getArgs().contains("e"));
	}

	@Test
	void testSet2() {
		Assertions.assertNotNull(configClass.getArgs());
		Assertions.assertEquals(7, configClass.getArgs().size());
		Assertions.assertTrue(configClass.getArgs().contains("e"));
	}
}
