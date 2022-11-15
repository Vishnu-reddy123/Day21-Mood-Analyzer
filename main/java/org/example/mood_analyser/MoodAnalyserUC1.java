package org.example.mood_analyser;

public class MoodAnalyserUC1 {
    private String message;

    public MoodAnalyserUC1(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
