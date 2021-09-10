package hw_lesson15;

import java.util.Objects;

public class Pet {
    private String petType;
    private String petName;

    public Pet(String petType, String petName) {
        this.petType = petType;
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", petName='" + petName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(petType, pet.petType) && Objects.equals(petName, pet.petName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petType, petName);
    }
}
