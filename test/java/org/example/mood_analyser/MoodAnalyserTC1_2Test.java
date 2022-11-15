package org.example.mood_analyser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTC1_2Test {
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyserTC1_2 moodAnalyser = new MoodAnalyserTC1_2();
        String actualResult = MoodAnalyserTC1_2.analyseMood("i am in sad mood");
        Assert.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessageContainsAnyInitShouldReturnHappy() {
        MoodAnalyserTC1_2 moodanalyser = new MoodAnalyserTC1_2();
        String actualResult = MoodAnalyserTC1_2.analyseMood("I am in Any Mood");
        Assert.assertEquals("Happy", actualResult);

    }
}