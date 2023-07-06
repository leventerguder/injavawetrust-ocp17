package chapter02.comparing_values;

public class InstanceOfOperator2 {


    public static void main(String[] args) {

                /*
        In this example, only one object is created in memory,
        but there are three different references to it
        because Integer inherits both Number and Object.
         */
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        System.out.println("obj instanceof Integer : " + (obj instanceof Integer));
        System.out.println("obj instanceof Number : " + (obj instanceof Number));
        System.out.println("obj instanceof Object : " + (obj instanceof Object));
        System.out.println("obj instanceof Long : " + (obj instanceof Long));
        System.out.println("obj instanceof String : " + (obj instanceof String));
        System.out.println("obj instanceof MyInterface : " + (obj instanceof MyInterface));
        System.out.println("obj instanceof Runnable : " + (obj instanceof Runnable));
        System.out.println("obj instanceof Comparable : " + (obj instanceof Comparable));

        System.out.println("num instanceof Integer : " + (num instanceof Integer));
        System.out.println("num instanceof Number : " + (num instanceof Number));
        System.out.println("num instanceof Object : " + (num instanceof Object));
        System.out.println("num instanceof Long : " + (num instanceof Long));
        // System.out.println("num instanceof String : " + (num instanceof String));
        System.out.println("num instanceof MyInterface : " + (num instanceof MyInterface));
        System.out.println("num instanceof Runnable : " + (num instanceof Runnable));
        System.out.println("num instanceof Comparable : " + (num instanceof Comparable));


        System.out.println("zooTime instanceof Integer : " + (zooTime instanceof Integer));
        System.out.println("zooTime instanceof Number : " + (zooTime instanceof Number));
        System.out.println("zooTime instanceof Object : " + (zooTime instanceof Object));
        //System.out.println("zooTime instanceof Long : " + (zooTime instanceof Long));
        //System.out.println("zooTime instanceof String : " + (zooTime instanceof String));
        //System.out.println("zooTime instanceof MyInterface : " + (zooTime instanceof MyInterface));
        //System.out.println("zooTime instanceof Runnable : " + (zooTime instanceof Runnable));
        System.out.println("zooTime instanceof Comparable : " + (zooTime instanceof Comparable));

    }
}

interface MyInterface {
}