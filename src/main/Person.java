package main;

import java.io.Serializable;

/**
 * Created by Eugeny on 09.10.2016.
 */
class Person implements Serializable {
    String fio;
    int age;

    public Person(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                '}';
    }
}
