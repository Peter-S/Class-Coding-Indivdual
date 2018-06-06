package com.company;


public class PersonAbstract {

    public String personId;
    public String personName;
    public String personPhone;
    public String personAddress;
    public String personEmail;

    public PersonAbstract(String personId,
                          String personName,
                          String personPhone,
                          String personAddress,
                          String personEmail) {
        this.personId = personId;
        this.personName = personName;
        this.personPhone = personPhone;
        this.personAddress = personAddress;
        this.personEmail = personEmail;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    @Override
    public String toString() {
        return "PersonAbstract{" +
                "personId='" + personId + '\'' +
                ", personName='" + personName + '\'' +
                ", personPhone='" + personPhone + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", personEmail='" + personEmail + '\'' +
                '}';
    }
}
