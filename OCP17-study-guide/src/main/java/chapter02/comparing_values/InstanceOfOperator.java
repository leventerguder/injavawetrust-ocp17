package chapter02.comparing_values;

public class InstanceOfOperator {


    public static void main(String[] args) {

                /*
        In this example, only one object is created in memory,
        but there are three different references to it
        because Integer inherits both Number and Object.
         */
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof Number);
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof Long);
        System.out.println(obj instanceof String);

        System.out.println(num instanceof Integer);
        System.out.println(num instanceof Number);
        System.out.println(num instanceof Object);
        System.out.println(num instanceof Long);
        // System.out.println(num instanceof String); // Compile Error

        System.out.println(zooTime instanceof Integer);
        System.out.println(zooTime instanceof Number);
        System.out.println(zooTime instanceof Object);
        // System.out.println(zooTime instanceof Long); // Compile Error
        // System.out.println(zooTime instanceof String); // Compile Error

    }
}
