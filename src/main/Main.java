package main;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    private void run() {
        Person[] persons = createPersons();
        printPersons(persons);

        writeToFile(persons);

        Person[] persons2 = readFromFile("example.txt");

    }

    private Person[] readFromFile(String filename) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            PersonHolder ph = (PersonHolder) ois.readObject(); // приведение типа объекта
            return ph.getPersons();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void writeToFile(Person[] persons) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("example.txt"));
//            for (int i=0; i<persons.length; i++) {
//                oos.writeObject(persons[i]);
//            }
            oos.writeObject(new PersonHolder(persons));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void printPersons(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

    private Person[] createPersons() {
        return new Person[]{
                    new Person("Иванов", 22),
                    new Person("Петров", 23),
                    new Person("Сидоров", 19)
            };
    }
}

