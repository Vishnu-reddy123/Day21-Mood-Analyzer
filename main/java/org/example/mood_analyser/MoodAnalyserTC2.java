package org.example.mood_analyser;

public class MoodAnalyserTC2 {
    public static String message;

    // Constructor
    public MoodAnalyserTC2(String message) {
        MoodAnalyserTC2.message = message;
        analyseMood();
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        MoodAnalyserTC2.message = message;
    }

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }

}
