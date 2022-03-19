package ru.avalon.vergentev.j110.labwork2a;

public class Students extends Persons {
    Consts LEVEL;
    private int courseNumber;
    private String dissertationTitle;

    //Constructors
    public Students(String surname, String name, Consts SEX, String faculty, Consts LEVEL, int courseNumber) {
        super(surname, name, SEX, faculty);
        this.LEVEL = LEVEL;
        setCourseNumber(courseNumber);
    }


    //Methods
    @Override
    public void print() {
        super.print();
        System.out.print("studies at ");
        System.out.print(getFaculty() + " faculty. ");
        switch (SEX) {
            case MALE: System.out.print("He is "); break;
            case FEMALE: System.out.print("She is "); break;
        }
        System.out.print(getCourseNumber() + " year ");
        switch (LEVEL) {
        case BACHELOR: System.out.print(Consts.BACHELOR + "'s student. "); break;
        case MASTER: System.out.print(Consts.MASTER + "student. "); break;
    }
}


    //Setters and Getters
    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        if (courseNumber < 1 ){
            throw new IllegalArgumentException("Number of course can't less than one");
        }
        this.courseNumber = courseNumber;
    }

    public String getDissertationTitle() {
        return dissertationTitle;
    }

    public void setDissertationTitle(String dissertationTitle) {
        this.dissertationTitle = dissertationTitle;
    }
}
