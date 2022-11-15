package org.example.mood_analyser;

public class MoodAnalyserTC1_2 {

        public static String analyseMood(String message) {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            }
            return "Happy";
        }
    }
