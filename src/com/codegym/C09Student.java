package com.codegym;

public class C09Student {
    private int id;
    private String name;

    private int age;

    private boolean isLearning;

    public C09Student(int id, String name, int age, boolean isLearning) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isLearning = isLearning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLearning() {
        return isLearning;
    }

    public void setLearning(boolean learning) {
        isLearning = learning;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isLearning=" + isLearning +
                '}';
    }
}
