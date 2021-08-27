public class HelloWorld {
  public static void main(String[] args) {
    try {
        Class clazz1= Class.forName("java.util.List");
        System.out.println(clazz1);
        Class clazz2= Class.forName("com.sample.Person");
        System.out.println(clazz2);
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
  }
}

