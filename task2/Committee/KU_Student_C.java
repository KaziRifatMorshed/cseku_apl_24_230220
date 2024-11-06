package Committee;

import java.util.ArrayList;

public class KU_Student_C extends Person_AC {
    private String discipline;
    private int year; // 1st year or 2nd year or 3rd year or 4th year

    public KU_Student_C(String name, String discipline, int year, ArrayList<String> interests, ArrayList<String> expertise) {
        this.name = name;
        this.discipline = discipline;
        this.year = year;
        this.interests = interests;
        this.expertise = expertise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public ArrayList<String> getExpertise() {
        return expertise;
    }

    public void setExpertise(ArrayList<String> expertise) {
        this.expertise = expertise;
    }
}
