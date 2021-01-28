package programming.project.temperatureConversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaleInput = new Scanner(System.in);
        System.out.println("Enter F to convert Farenheit or enter C to convert to Celcius");
        char temperatureScale = scaleInput.next().charAt(0);
        System.out.println("Now enter the temperature value:");
        Scanner tempInput = new Scanner(System.in);
        double temp = tempInput.nextInt();

       if (temperatureScale == 'F'){
           farenheitConverter(temp);
       }
    else {
        celciusConverter(temp);
       }
    }

    public static void celciusConverter(double userCelcius){

        userCelcius = ((userCelcius * 1.8) + 32);
        System.out.println(userCelcius +" F Degrees");
    }

    public static void farenheitConverter(double userFarenheit){
         userFarenheit = ((userFarenheit - 32) * 0.5556);
        System.out.println(userFarenheit +" C Degrees");
    }
}

