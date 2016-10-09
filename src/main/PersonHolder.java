package main;

import java.io.Serializable;

/**
 * Created by Eugeny on 09.10.2016.
 */
public class PersonHolder implements Serializable {
    private Person[] persons;

    public PersonHolder(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }
}
