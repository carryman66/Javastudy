package com.carryman.oop.senior;

/**
 * @author carry man
 * @version 1.0
 */
public class Week {

    public static void main(String[] args) {

        WeekTest[] values = WeekTest.values();

        for (WeekTest value : values) {
            System.out.println(value.getName());
        }
    }
}

enum WeekTest{
    MONDAY("星期一"),  TUESDAY("星期二"),WEDNESDAY("星期三");
    private final String name;

    WeekTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
