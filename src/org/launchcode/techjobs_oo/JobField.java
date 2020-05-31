package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;


    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String aValue){
        this();
        value = aValue;
    }

    @Override
    public String toString() {
        return value;
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    };

    ///getters and setters
    public static int getNextId() {
        return nextId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //GETTER FOR ID FIELD
    public int getId() {
        return id;
    }
}
