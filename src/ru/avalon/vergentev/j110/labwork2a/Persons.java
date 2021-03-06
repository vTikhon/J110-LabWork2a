package ru.avalon.vergentev.j110.labwork2a;

public class Persons {
    private String surname;
    private String name;
    private String faculty;
    Sex SEX;

    //Constructors
    public Persons(String surname, String name, Sex SEX, String faculty) {
        setSurname(surname);
        setName(name);
        this.SEX = SEX;
        setFaculty(faculty);
    }

    //Methods
public void print () {
    System.out.println('\n');
    System.out.print("This is " + getSurname() + " " + getName() + ". ");
    switch (SEX) {
        case MALE: System.out.print("He "); break;
        case FEMALE: System.out.print("She "); break;
    }
}

    public static void printAll (Persons [][] persons) {
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length; j++) {
                if (persons[j][i] != null) {
                    persons[j][i].print();
                }
            }
        }
    }




    //Setters and Getters
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
