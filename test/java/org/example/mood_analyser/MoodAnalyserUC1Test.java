package org.example.mood_analyser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserUC1Test {
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyserUC1 moodAnalyzer = new MoodAnalyserUC1("This is a Sad Message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyserUC1 moodAnalyzer = new MoodAnalyserUC1("This is Happy Messgae");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}