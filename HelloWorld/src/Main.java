import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        System.out.println("First Dice up:" + d1.getFaceUp());
        System.out.println("Second Dice up:" + d2.getFaceUp());

        d1.roll();
        d2.roll();

        System.out.println("First Dice up:" + d1.getFaceUp());
        System.out.println("Second Dice up:" + d2.getFaceUp());

        /*System.out.println("Please input an age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age>=0 && age<=5){
            System.out.println("Baby");
        } else if(age>=6 && age<=11){
            System.out.println("Kid");
        } else if(age>=12 && age<=17){
            System.out.println("Teen");
        } else if (age>=18){
            System.out.println("Adult");
        } else {
            System.out.println("Invalid");
        }

        System.out.println("Thanks for nothing");*/




  /*
        Dog newDog = new Dog("Pug",1,"Pepper");
        System.out.println(newDog.breed);
        System.out.println(newDog.age);
        System.out.println(newDog.name);

        newDog.addFetchedItems(new String[]{"carnaza", "jugete", "coladera"});
        newDog.getFetchedItems();


        // 31, 45, 22, 98, 10
        int[] numbers = new int[5];
        numbers[0]=31;
        numbers[1]=45;
        numbers[2]=22;
        numbers[3]=98;
        numbers[4]=10;

        int[] numbers2 = {31, 45, 22, 98, 10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] myFavoriteCandyBars = {"Twix","Hershey's", "Crunch"};
        System.out.println("Index 1: " + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2]="Butterfinger";
        System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        System.out.println("Length: "+ myFavoriteCandyBars.length);

        System.out.println(Array.get(myFavoriteCandyBars, 2));

        System.out.println("Hello World");
        System.out.println("Alonso");


        Car myCar = new Car(25.5,"1BC3E", Color.BLUE,true);
        Car alCar = new Car(13.9,"3BO3N", Color.BLACK,false);

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);

        System.out.println("My Car's Licence Plate: "+myCar.licencePlate);
        System.out.println("My Car's Licence Plate: "+alCar.licencePlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.ORANGE);
        System.out.println(myCar.paintColor);




        //System.out.println("Enter a word:");
        Scanner sc = new Scanner(System.in);
        int userNumber=sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);

        String userInput = sc.next();
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);
        System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));
    */
    }
}
