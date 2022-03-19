package ru.avalon.vergentev.j110.labwork2a;

public class Main {
    public static void main(String[] args) {
        Persons [][] persons = new Persons[3][3];
        persons[0][0] = new Teachers("Turner", "Ronald", Consts.MALE,"Computer science", Consts.PHD, "Programming paradigms");
        persons[1][0] = new Teachers("Hollings", "Ruth", Consts.FEMALE,"Jurisprudence", Consts.MSC, "Domestic arbitration");
        persons[0][1] = new Students("Wilkinson", "Leo", Consts.MALE,"Computer science", Consts.BACHELOR, 3);
        persons[1][1] = new Students("Cunningham", "Anna", Consts.FEMALE,"World Economy", Consts.BACHELOR, 1);
        persons[2][1] = new Students("Lundqvist", "Jill", Consts.FEMALE,"Jurisprudence", Consts.BACHELOR, 1);
        persons[0][2] = new Postgraduates("Correa", "Ronald", Consts.MALE,"Computer science", "Design of a functional programming language");

        Persons.printAll(persons);


    }
}
