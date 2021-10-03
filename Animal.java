package hw_lesson21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    @AnimalAnnotation("Good name")
    private String name;
    @AnimalAnnotation("Not this type")
    private String type;
    private int age;
    private int weight;

    public Animal(String name, String type, int age, int weight) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return type;
    }

    public void setBreed(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + type + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) throws IOException {
        writeFieldsWithAnnotationToFile(Animal.class);
    }

    public static void writeFieldsWithAnnotationToFile(Class<?> customClass) throws IOException {
        Field[] fields = customClass.getDeclaredFields();
        List<String> fieldsWithAnnotation = new ArrayList<>();

        for(int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if(field.getAnnotation(AnimalAnnotation.class) instanceof AnimalAnnotation) {
                BufferedWriter writer = new BufferedWriter(new FileWriter("FieldsWithAnnotation.txt"));
                fieldsWithAnnotation.add(field.getName());
                for(String s : fieldsWithAnnotation) {
                    writer.write(s + " ");
                }
                writer.close();
            }
        }
    }
}
