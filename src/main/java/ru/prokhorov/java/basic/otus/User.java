package ru.prokhorov.java.basic.otus;

public class User {
    private String familyName;
    private String name;
    private String middleName;
    private int yearOfBirth;
    private String email;
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public User(String familyName, String name, String middleName, int yearOfBirth, String email) {
        this.familyName = familyName;
        this.name = name;
        this.middleName = middleName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }
    public void info() {
        System.out.println("ФИО:" + familyName + " " + name + " " + middleName + "\nГод рождения:" + yearOfBirth +
                "\ne-mail:" + email);
    }
}
