package hw06;

import java.lang.reflect.Field;

public class hw06 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("hw06.Person");
            Person person = (Person)aClass.newInstance();
            System.out.println(person.toString());
            Field name = aClass.getDeclaredField("name");
            name.setAccessible(true);
            name.set(person,"张三");
            Field age = aClass.getDeclaredField("age");
            age.setAccessible(true);
            age.set(person,19);
            System.out.println(person);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
