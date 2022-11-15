package org.example.mood_analyser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyzerUC2Test {
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzerUC2 moodAnalyzer = new MoodAnalyzerUC2("This is a Sad Message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzerUC2 moodAnalyzer = new MoodAnalyzerUC2("This is Happy Messgae");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        MoodAnalyzerUC2 moodAnalyzer = new MoodAnalyzerUC2(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}

