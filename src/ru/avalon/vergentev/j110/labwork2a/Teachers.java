package ru.avalon.vergentev.j110.labwork2a;

public class Teachers extends Persons {
    Degree DEGREE;
    private String specialization;

    //Constructors
    public Teachers(String surname, String name, Sex SEX, String faculty, Degree DEGREE, String specialization) {
        super(surname, name, SEX, faculty);
        this.DEGREE = DEGREE;
        setSpecialization(specialization);
    }



    //Methods
    @Override
    public void print() {
        super.print();
        System.out.print("teaches at ");
        System.out.print(getFaculty() + " faculty. ");
        switch (SEX) {
            case MALE: System.out.print("He has "); break;
            case FEMALE: System.out.print("She has "); break;
        }
        switch (DEGREE) {
            case MSC: System.out.print("Master of science degree in " + getSpecialization() + ". "); break;
            case PHD: System.out.print("PhD degree in " + getSpecialization() + ". "); break;
            case DSC: System.out.print("Doctor of science degree  in " + getSpecialization() + ". "); break;
        }
    }

    //Setters and Getters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
