package hw_lesson19;

import java.io.*;
import java.util.ArrayList;

public class Methods {
    private static void serialize(Employee employee) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        oos.flush();
        oos.close();
        fos.close();
    }

    private static void deserialize(Employee employee) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("output.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee employee2 = (Employee) ois.readObject();
        System.out.println(employee2.toString());
        ois.close();
        fis.close();
    }

    private static void serializeList(ArrayList<Employee> employeeList) throws IOException {
        FileOutputStream fos = new FileOutputStream("outputList.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employeeList);
        oos.flush();
        oos.close();
        fos.close();
    }

    private static void deserializeList(ArrayList<Employee> employeeList) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("outputList.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList employeeList2 = (ArrayList) ois.readObject();
        for(Object o : employeeList2) {
            System.out.println(o);
        }
        ois.close();
        fis.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Alex", 19, 800);
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Simon", 25, 2500));
        employeeList.add(new Employee("Ryuk", 38, 6000));
        employeeList.add(new Employee("Alan", 22, 2000));
        employeeList.add(new Employee("Herman", 45, 8800));

        serialize(employee);
        deserialize(employee);
        System.out.println();
        serializeList(employeeList);
        deserializeList(employeeList);
    }
}