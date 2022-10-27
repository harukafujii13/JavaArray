package arraydemo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] intVariablesArray = {1,2,3,4,5,6,7,8,9};

        // for(int num: intVariablesArray){
        //     System.out.println(num);
        // }
        
        System.out.println(Arrays.toString(intVariablesArray));

        float[] floatVariablesArray = {0.0f, 1.2f, 3.65f, 56.45f };
        System.out.println(Arrays.toString(floatVariablesArray));

        String[] names = {"Haruka", "Fujii"};
        System.out.println(Arrays.toString(names));

        System.out.println("==========================");

        int val = 10;
        System.out.println("Before displayByValue");
        displayByValue(val);
        System.out.println("After displayByValue");


        System.out.println("==========================");
        System.out.println("Before displayReference: " + names[0]);
        displayByreference(names);
        System.out.println("After displayReference: " + names[0]);
        


    }

    static void displayByValue(int value){
        System.out.println("(before) : " + value);
        value = 20;
        System.out.println("(after) : " + value);
    }
     static void displayByreference(String[] names){
        System.out.println("(before) : " + names[0]);
        names[0] = "Gray";
        System.out.println("(after) : " + names[0]);
        
    }
}
