package com.company;

public class Student extends PersonAbstract {

    public boolean status;

    public Student(String personId, String personName,
                   String personPhone, String personAddress,
                   String personEmail, boolean status) {
        super(personId, personName, personPhone, personAddress, personEmail);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "status=" + status +
                '}';
    }

    public void updateCertifications() {
//        method goes here
    }

    public void addCertification() {
//        method goes here
    }

    public void deleteCertification() {
//        method goes here
    }

    public void checkStatus() {
//        method goes here
    }
}
