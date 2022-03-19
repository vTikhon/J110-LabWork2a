package ru.avalon.vergentev.j110.labwork2a;

public class Main {
    public static void main(String[] args) {
        Persons [][] persons = new Persons[3][3];
        persons[0][0] = new Teachers("Turner", "Ronald", Sex.MALE,"Computer science", Degree.PHD, "Programming paradigms");
        persons[1][0] = new Teachers("Hollings", "Ruth", Sex.FEMALE,"Jurisprudence", Degree.MSC, "Domestic arbitration");
        persons[0][1] = new Students("Wilkinson", "Leo", Sex.MALE,"Computer science", Level.BACHELOR, 3);
        persons[1][1] = new Students("Cunningham", "Anna", Sex.FEMALE,"World Economy", Level.BACHELOR, 1);
        persons[2][1] = new Students("Lundqvist", "Jill", Sex.FEMALE,"Jurisprudence", Level.BACHELOR, 1);
        persons[0][2] = new Postgraduates("Correa", "Ronald", Sex.MALE,"Computer science", "Design of a functional programming language");

        Persons.printAll(persons);

    }
}
