package org.crinsonsn0w.Eureka.Server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class EurekaServerApplicationTests {

    @Autowired
    private WebApplicationContext webAppContext;

	@Test
	void contextLoads() {
	    assertThat(webAppContext).isNotNull();
	}
}
