package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        NameLastName nameLastName = new NameLastName("Ivan", "Pikula");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(nameLastName);
        System.out.println(json);
    }

    static class NameLastName {
        String name;
        String lastName;

        public NameLastName(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;

        }

    }
}
