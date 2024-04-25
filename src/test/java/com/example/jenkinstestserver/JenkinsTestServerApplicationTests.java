package com.example.jenkinstestserver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestServerApplicationTests {

    @Test
    void contextLoads() {
        Assertions.assertThat(1).isEqualTo(2);
    }

}
