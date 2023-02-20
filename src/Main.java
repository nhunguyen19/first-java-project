import java.sql.SQLOutput;
import java.time.LocalDate; // package
import java.util.Arrays;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = new String("Luis");
        // java.util.Date date = new java.util.Date()
        Date date = new Date();
        // print
        System.out.println("Name:");
        System.out.println(name);
        System.out.println("Name in uppercase:");
        System.out.println(name.toUpperCase());
        System.out.println("Print character at position (1) of string:");
        System.out.println(name.charAt(1)); // i
        System.out.println("Check if string contains (na):");
        System.out.println(name.contains("na"));
        LocalDate now = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("-------------");
        System.out.println("Month (now):");
        System.out.println(now.getMonth());

        // Math class
        System.out.println("-------------");
        System.out.println("Math class:");
        System.out.println("Absolute:");
        System.out.println(Math.abs(-10));
        System.out.println("Maximal of (2,10):");
        System.out.println(Math.max(2,10));
        System.out.println("Power of (5,2):");
        System.out.println(Math.pow(5.0,2.0)); // 25.0
        System.out.println("Sqrt:");
        System.out.println((int) Math.sqrt(25));

        // primitive variables
        System.out.println("-------------");
        System.out.println("Primitive variables:");
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " " + "b = " + b); // a = 100 b = 10
        // reference variables
        System.out.println("-------------");
        System.out.println("Reference variables:");
        Person alex = new Person("Alex");
        Person nina = alex;

        System.out.println(alex.name + " " + nina.name);
        // Alex Alex
        alex.name = "Xander";
        System.out.println(alex.name + " " + nina.name);
        // Xander Xander
        nina.name = "Nina";
        System.out.println(alex.name + " " + nina.name);
        // Nina Nina

        // Arithmetic operations
        System.out.println("-------------");
        System.out.println("Arithmetic operations:");
        System.out.println("10 % 3:");
        System.out.println(10%3);
        System.out.println();

        // Logical operations
        System.out.println("-------------");
        System.out.println("Logical operations:");
        boolean isAdult = true;
        boolean isStudent = false;
        System.out.println(isAdult && isStudent); // false
        System.out.println(isAdult||isStudent); // true
        System.out.println(!isAdult||isStudent); // false

        // If-Statement
        System.out.println("-------------");
        System.out.println("If statement:");
        int age = 17;
        System.out.println("Age = " + age);
        if(age>=18){
            System.out.println("Adult");
        }
        else if(age >= 16 && age < 18){
            System.out.println("Almost adult");
        }
        else{
            System.out.println("I am not adult");
        }

        // Ternary operator
        System.out.println("-------------");
        System.out.println("Ternary operator:");
        int age2 = 15;
        String message = age2 >= 18? "I am an adult" : "I am not adult";
        System.out.println("My age: " + age2);
        System.out.println(message);

        // Switch statement
        System.out.println("-------------");
        System.out.println("Switch statement:");
        String gender = "FEMALE";
        switch(gender){
            case "FEMALE":
                System.out.println("I am female");
                break;
            case "MALE":
                System.out.println("I am male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Prefer not say");
                break;
            default:
                System.out.println("Unidentified");
                break;
        }

        // Array
        System.out.println("-------------");
        System.out.println("Array:");
        int [] number = {1, 2, 3, 4};
        System.out.println("String 1:");
        System.out.println(Arrays.toString(number));
        System.out.println("3rd element of string 1:");
        System.out.println(number[2]);
        // Another way
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 8;
        numbers[2] = 12;
        System.out.println("String 2:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("length of string 2");
        System.out.println(numbers.length);

        // for loop
        System.out.println("-------------");
        System.out.println("For loop:");
        int [] numbers2 = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int i = 0; i < numbers2.length; i++){
            System.out.println(numbers2[i]);
        }

        System.out.println("-------------");
        System.out.println("Enhanced For loop:");
        for(int number2 : numbers2){
            System.out.println(number2);
        }

        System.out.println("Advanced:");
        Arrays.stream(numbers2).forEach(System.out::println);

        // Break and Continue
        System.out.println("-------------");
        System.out.println("Break and Continue:");
        String[] names = {"Anna","Jacob","Xander"};
        System.out.println("Print all names from string:");
        for(String name1 :names){
            System.out.println(name1);
        }
        System.out.println("Print once and break:");
        for(String name1 :names){
            System.out.println(name1);
            break;
        }
        System.out.println("Break with condition, print until reach name Jacob:");
        for(String name1 :names){
            if(name1.equals("Jacob")){
                break;
            }
            System.out.println(name1);
        }
        System.out.println("If name starts with 'A', continue:");
        for(String name1 :names){
            if(name1.startsWith("A")){
                continue;
            }
            System.out.println(name1);
        }
        // while loop
        System.out.println("-------------");
        System.out.println("While loop:");
        int count = 0;
        while(count < 5){
            System.out.println(count);
            count++;
        }

        // do while loop
        System.out.println("-------------");
        System.out.println("Do while loop (always print as least once:");
        do{
            System.out.println(count);
            count++;
        }while(count < 5); // print 5 only, then stop

        // scanner class
        System.out.println("-------------");
        System.out.println("Scanner class (take input from user):");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name2 = scanner.nextLine();
        System.out.println("Hi " + name2);
        System.out.println("How old are you?");
        int age3 = scanner.nextInt();
        System.out.println("You are " + age3);
        int year = LocalDate.now().minusYears(age3).getYear();
        System.out.println("You was born in year " + year);

        // Methods
        System.out.println("-------------");
        System.out.println("Methods:");
        char[] letters = {'A','A','B','C','D','D','D'};
        System.out.println("Array:");
        for(char letter:letters)
        {
            System.out.println(letter);
        }
        int letterCount = countOccurences(letters,'A');
        System.out.println("Number of 'A's in array:");
        System.out.println(letterCount);

        // Objects
        System.out.println("-------------");
        System.out.println("Objects:");
        Lens lensOne = new Lens("Sony","85mm", true);
        // Print Object
        System.out.println("Lens:");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
    }
    // Classes
    // static to use for static main
    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;
        // Constructor
        Lens(String brand, String focalLength, boolean isPrime){
            this.brand = brand;
            this.focalLength=focalLength;
            this.isPrime = isPrime;
        }
    }

    public static int countOccurences(char[] letters, char searchLetter){
        int count = 0;
        for(char letter: letters){
            if(letter == searchLetter){
                count ++;
            }
        }
        return count;
    }
    // Class
    static class Person {
        String name;
        Person(String name){
            this.name = name;
        }
    }
}