package cz.itstep;

import cz.itstep.Car;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

class Person {

    private String firstName;
    private String lastName;
    private LocalDate born;

    private Car car;

    private Car secondCar;

    private int age;

    public Car getSecondCar() {
        return secondCar;
    }

    public void setSecondCar(Car secondCar) {
        this.secondCar = secondCar;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(born, person.born);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, born, age);
    }

    @Override
    protected Person clone() {
        Person copyOfPerson = new Person();
        copyOfPerson.setCar(car.clone());
        copyOfPerson.setFirstName(firstName);
        copyOfPerson.setLastName(lastName);
        copyOfPerson.setBorn(born);
        copyOfPerson.setAge(21);
        return copyOfPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", born=" + born +
                ", car=" + car +
                ", secondCar=" + secondCar +
                ", age=" + age +
                '}';
    }
}
