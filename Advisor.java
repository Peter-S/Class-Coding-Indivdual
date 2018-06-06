package com.company;

public class Advisor extends PersonAbstract {

    public String advisorPosition;

    public Advisor(String personId,
                   String personName, String personPhone,
                   String personAddress, String personEmail,
                   String advisorPosition) {
        super(personId, personName, personPhone, personAddress, personEmail);
        this.advisorPosition = advisorPosition;
    }

    @Override
    public String toString() {
        return "Advisor{" +
                "advisorPosition='" + advisorPosition + '\'' +
                ", personName='" + personName + '\'' +
                ", personEmail='" + personEmail + '\'' +
                '}';
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

    public void giveFeedback() {
//        method goes here
    }


}
