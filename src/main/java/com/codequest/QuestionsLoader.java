package com.codequest;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class QuestionsLoader {
    public static List<Question> load(String filename) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = QuestionsLoader.class.getClassLoader().getResourceAsStream(filename)) {
            return objectMapper.readValue(inputStream, objectMapper.getTypeFactory().constructCollectionType(List.class, Question.class));
        } catch (IOException e) {
            throw new IOException(String.format("Failed to load file %s", filename), e);
        }
    }
}
