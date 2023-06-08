package com.JavaProject;

import lombok.Data;

@Data
public class DemoData {
    private int userId;
    private int id;
    private String title;
    private String body;


    public static String ok(String string) {
        return string;
    }
}
