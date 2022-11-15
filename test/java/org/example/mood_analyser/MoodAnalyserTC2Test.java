package org.example.mood_analyser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTC2Test {
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyserTC2 moodAnalyser = new MoodAnalyserTC2("i am in sad mood");
        String actualResult = MoodAnalyserTC2.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }
    @Test
    public void givenMessageContainsAnyInitShouldReturnHappy() {
        MoodAnalyserTC2 moodanalyser = new MoodAnalyserTC2("I am in Any Mood");
        String actualResult = MoodAnalyserTC2.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
    @Test
    public void givenMessage_Null_ShouldReturnHappy() {
        MoodAnalyserTC2 moodanalyser = new MoodAnalyserTC2(null);
        String actualResult = MoodAnalyserTC2.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }

}