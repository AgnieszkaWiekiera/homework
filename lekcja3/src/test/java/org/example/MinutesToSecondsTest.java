package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsTest {

    @org.junit.jupiter.api.Test
    void shouldconvertMinutesToSeconds() {

        //given
        int seconds = 3;

        //when
        int convertMinutesToSeconds = MinutesToSeconds.convertMinutesToSeconds(3);

        //then
        Assertions.assertEquals(180, convertMinutesToSeconds);

    }
}