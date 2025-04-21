package com.codequest;

public class Question {
    private int id;
    private String question;
    private String answer;
    private String difficulty;
    private int xp;

    public Question() {
        // Constructor needed for Jackson.
    }

    public Question(int id, String question, String answer, String difficulty, int xp) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
        this.xp = xp;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getXp() {
        return xp;
    }
}
