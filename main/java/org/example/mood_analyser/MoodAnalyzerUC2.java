package org.example.mood_analyser;

public class MoodAnalyzerUC2 {
    private String message;
    public MoodAnalyzerUC2(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            return "HAPPY";
        }
    }
}

