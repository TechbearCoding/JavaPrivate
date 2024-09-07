package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> stList = new ArrayList<>();
        stList.add(new Student("Jānis", "Bērziņš"));
        stList.add(new Student("Juris", "Ābols"));

        writeToFile(stList);

        List<Student> newList = readFile();
        for(Student st : newList){
            System.out.println(st.getStudent());
        }
    }

    private static List<Student> readFile() {
        List<Student> st;
        Gson gson = new Gson();
        try {
            String content = Files.readString(Path.of("data.txt"), StandardCharsets.UTF_8);
            st = List.of(gson.fromJson(content, Student[].class));
        } catch (IOException e) {
            st = new ArrayList<>();
        }

        return st;
    }

    private static void writeToFile(List<Student> petList){
        Gson gson = new Gson();
        String json = gson.toJson(petList);

        try {
            FileWriter myWriter = new FileWriter("data.txt");
            myWriter.write(json);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}