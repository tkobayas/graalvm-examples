package org.example;

public class ConfigureAtRunTime {
    public static void main(String[] args) throws Throwable {
        try {
            Class clazz1= Class.forName("java.util.List");
            System.out.println(clazz1);
            Class clazz2= Class.forName("com.sample.Person");
            System.out.println(clazz2);
            System.out.println(clazz2.getConstructor().newInstance());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
