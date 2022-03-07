package be.intecbrussel.wrappers;

public class WrapperEgs {

    public static void main(String[] args) {

        Integer intObject = Integer.valueOf(5);
        System.out.println(intObject);
        int intPrimitive = intObject.intValue();

        Integer value1 = Integer.valueOf(500);
        Integer value2 = Integer.valueOf(500);
        System.out.println(value1 == value2);
        System.out.println(value1.equals(value2));


        //autoboxing
        Integer intObjectx = 5;
        int intPrim = Integer.valueOf(6);
        System.out.println(intObjectx);
        System.out.println(intPrim);
        }

}



