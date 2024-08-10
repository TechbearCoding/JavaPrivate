package org.example;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Janis", "Berzins");
        System.out.println(st1.getStudent());

        Student st2 = new Student("Juris", "Berzins");
        System.out.println(st2.getStudent());

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(new Student("Anna", "Ozola"));

        Gson gson = new Gson();
        String json = gson.toJson(st1);
        System.out.println(json);

        json = gson.toJson(studentList);
        System.out.println(json);

        List<Student> lst2 = List.of(gson.fromJson(json, Student[].class));
        for(Student st : lst2){
            System.out.println(st.getStudent());
        }
    }

    private void sample1(){
        List<String> lst = new ArrayList();
        lst.add("aaa");
        lst.add("bbb");
        lst.add("ccc");
        lst.add("ddd");

        Gson gson = new Gson();
        String json = gson.toJson(lst);

        System.out.println(json);

        List<String> lst2 = List.of(gson.fromJson(json, String[].class));

        for(String e : lst2){
            System.out.println(e);
        }
    }
}