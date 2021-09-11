package hw_lesson16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class kc = Keyboard.class;

        String className = kc.getName();
        System.out.println("Class name >> " + className);

        String simpleName = kc.getSimpleName();
        System.out.println("Simple name >> " + simpleName);

        System.out.println();

        int modifier = kc.getModifiers();
        String modifierText = Modifier.toString(modifier);
        System.out.println("Class modifier >> " + modifierText + ", int >> " + modifier);

        System.out.println("Is static >> " + Modifier.isStatic(modifier));
        System.out.println("Is public >> " + Modifier.isPublic(modifier));
        System.out.println("Is abstract >> " + Modifier.isAbstract(modifier));

        System.out.println();

        Package classPackage = kc.getPackage();
        System.out.println("Class package >> " + classPackage);

        System.out.println();

        Class superClass = kc.getSuperclass();
        System.out.println("Super class >> " + superClass);

        System.out.println();

        Class [] interfaces = kc.getInterfaces();
        System.out.println("Interfaces = " + Arrays.toString(interfaces));

        System.out.println();

        Constructor<Keyboard>[] keyboardConstructor = kc.getConstructors();

        for (int i = 0; i < keyboardConstructor.length; i++) {
            Constructor<Keyboard> constructor = keyboardConstructor[i];
            System.out.println("Constructor >> " + constructor);
        }

        System.out.println("Constructors size >> " + keyboardConstructor.length);

        System.out.println();

        Constructor<Keyboard> constructor = keyboardConstructor[0];

        Class<?>[] parameterTypes = constructor.getParameterTypes();

        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> class1 = parameterTypes[i];
            System.out.println(class1);
        }

        System.out.println();

        Constructor<Keyboard> singleConstructor = kc.getConstructor(String.class, String.class, String.class, String.class, double.class, double.class, double.class);
        System.out.println("Single constructor = " + singleConstructor);

        Keyboard newInstanceKeyboard = singleConstructor.newInstance("Varmilo", "VA87M", "Mechanical", "Red", 13.4, 35.6, 0.85);
        System.out.println("Reflection Keyboard = " + newInstanceKeyboard);

        System.out.println();

        Field[] fields = kc.getFields();
        for(int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println(field);
        }

        System.out.println();

        fields = kc.getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println(field);
        }
    }
}
