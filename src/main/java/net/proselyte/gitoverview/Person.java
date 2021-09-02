package net.proselyte.gitoverview;

public class Person extends BaseEntity{
    private String firstName;
    private String secondName;

    public Person(Long id, String firstName, String secondName) {
        super(id);
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + super.getId() + '\'' +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
