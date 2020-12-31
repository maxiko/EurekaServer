package org.crimsonsn0w.EurekaServer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.context.WebApplicationContext;
import static org.assertj.core.api.Assertions.assertThat;


@ActiveProfiles("build")
@SpringBootTest
class EurekaServerApplicationTests {

    @Autowired
    private WebApplicationContext webAppContext;

	@Test
	void contextLoads() {
	    assertThat(webAppContext).isNotNull();
	}
}
