package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
@Deprecated(since = "0.0.1-SNAPSHOT", forRemoval = true)
public class TempTest {

    @Test
    void tempTest() {
        // given
        StringBuilder sb = new StringBuilder("Test");

        //when
        sb.append("Test");

        //then
        assertThat(sb.toString()).isEqualTo("TestTest");
    }
}
