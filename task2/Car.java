package hw_lesson11.task2;

public class Car {
    int horsepower;
    int yearOfManufacture;

    public Car(int horsepower, int yearOfManufacture) {
        this.horsepower = horsepower;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Car(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
