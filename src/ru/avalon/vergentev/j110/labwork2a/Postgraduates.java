package ru.avalon.vergentev.j110.labwork2a;

public class Postgraduates extends Persons {
    private String dissertationTitle;



    //Constructors
    public Postgraduates(String surname, String name, Sex SEX, String faculty, String dissertationTitle) {
        super(surname, name, SEX, faculty);
        setDissertationTitle(dissertationTitle);
    }

    //Methods
    @Override
    public void print() {
        super.print();
        System.out.print("studies at ");
        System.out.print(getFaculty() + " faculty. ");
        switch (SEX) {
            case MALE: System.out.print("His "); break;
            case FEMALE: System.out.print("Her "); break;
        }
        System.out.print("thesis title is " + getDissertationTitle() + ". ");
    }


    //Setters and Getters
    public String getDissertationTitle() {
        return dissertationTitle;
    }

    public void setDissertationTitle(String dissertationTitle) {
        this.dissertationTitle = dissertationTitle;
    }
}
