package org.example.mood_analyser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTC1Test {
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyserTC1 moodAnalyser = new MoodAnalyserTC1();
        String actualResult = MoodAnalyserTC1.analyseMood("i am in sad mood");
        Assert.assertEquals("Sad", actualResult);

    }
}