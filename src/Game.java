import java.util.Random;
import java.util.Scanner;
public class Game {

    //Starting attributer som gør vores objekter globale
    public static Dog dog;
    public static Monki monkey;


    //Du vælger hvilket dyr du gerne vil have
    public static void main(String[] args) {
        int days = 10;
        int daysLeft = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want a monkey or a dog??????????? UwU ");
        String userInput = scanner.nextLine();

/////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Hvis du havde valgt "monkie" får du dette 10/10 programmering med en masse if-kommandoer

        if(userInput.equalsIgnoreCase("Monkey")){
           System.out.println("You have chosen a monkey");
           System.out.println("Now give tho monki a name UwU");
           String monkiName = scanner.nextLine();
           Game.monkey = new Monki(monkiName,10,5,false,true);
           System.out.println(monkiName+ " has been born");

           //Baggrund historie for abe og information som spilleren måske gerne vil have
           Scanner actions = new Scanner(System.in);
           System.out.println(monkiName+ " has only "+days+" to stay on your planet, before he return to monki land, enjoy your time with him and keep him alive");
           System.out.println("Since monki is smart unlike stupid dog, he doesnt need your help to get clean");
            System.out.println("But he has also figured out what depression is and his mood will decreased double as fast");

            //Her starter dagen så de 10 dage med et for loop. Hvor spilleren får lov til at bestemme hvad der skal ske
            //Indenfor de dage indtil for loopet er fuldført
           for (int i = 0; i < days; i++) {
               System.out.println("What would you like to do with "+monkiName+"?"+"\n1 - Check pet"+"\n2 - Feed pet"+"\n3 - play with pet"+"\n4 - Guessing game"+"\n5 - Days left"+"\n6 - Speak pet"+"\n7 - Other stuff");
               int userAction = actions.nextInt();

               //Her kommer så alle de forskellige muligheder brugeren kan vælge imellem fra 1-7
               if(userAction == 1){
                   System.out.println(Game.monkey);
                   i -=1;
               }
               else if(userAction == 2){
                   Game.monkey.feed();

               }
               else if(userAction == 3){
                   Game.monkey.playWithMonki();
               }
               else if(userAction == 4){
                   Game.monkey.gussWithMonkey();
               }
               else if(userAction == 5){
                   System.out.println("You have " +daysLeft+ " days left");
                   i-=1;
                   daysLeft+=1;
               }
               else if(userAction == 6){
                   Game.monkey.monkiSpeak();
               }
               else if(userAction == 7){
                   Game.monkey.randomStuffMonkey();
               }
               daysLeft -=1;

               //Metode for slutningen af dagen
               Game.monkey.endOfDayMonki();

               System.out.println("___________________________________________\n");
           }
           //Efter for loopet er færdig vil vi så slutte af med at sende spilleren til en metode som vi har kaldt monkiResult()
           System.out.println(monkiName + " days have ended, he now returns back to MonkiLand");
           monkiResult();
       }

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Hvis du valgte "dog" får du dette i stedet

        //Hvis du har læst hvad "monkey" gør for de forskellige steder, er dette nogenlunde det samme på mainen for
        //hvis du havde valgt "dog"
       else if (userInput.equalsIgnoreCase("Dog")){
           System.out.println("You have chosen a dog");
           System.out.println("Now give tho dog a name UwU");
           String dogName = scanner.nextLine();
           Game.dog = new Dog(dogName,10,5,false,true,true);
           System.out.println(dogName+ " has been born");

           System.out.println(dogName+ " is gonna go to Brazil in 10 days, use them wisely.");
           System.out.println("Since he is a dog he doesnt use energy as fast as a monkey");

           Scanner actions = new Scanner(System.in);

           for (int i = 0; i < days; i++) {
               System.out.println("What would you like to do with "+dogName+"?"+"\n1 - Check pet"+"\n2 - Feed pet"+"\n3 - Play with pet"+"\n4 - Wash pet"+"\n5 - Days left"+"\n6 - Pet speak"+"\n7 - Other stuff");
               int userAction = actions.nextInt();

               if(userAction == 1){
                   System.out.println(Game.dog);
                   i -=1;
               }
               else if(userAction == 2){
                   Game.dog.feed();
               }
               else if(userAction == 3){
                   Game.dog.playWithDog();
               }
               else if(userAction == 4){
                   Game.dog.isDogSmelly();
               }
               else if(userAction == 5){
                   System.out.println("You have " +daysLeft+ " days left");
                   i-=1;
                   daysLeft+=1;
               }
               else if(userAction == 6){
                   Game.dog.dogSpeak();
               }
               else if(userAction == 7){
                   Game.dog.randomStuffDog();
               }

               daysLeft -=1;

               //Slut på dagen metode
               Game.dog.endOfDayDog();
               System.out.println("___________________________________________\n");
           }
           System.out.println(dogName + " days have ended, he is now gonna go to Brazil.");
           dogResult();
       }

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Her har vi metoden til at vise ens stats for hvordan de har taget sig af sit dyr.
    public static void monkiResult(){
        System.out.println("///////Player Stats///////");
        System.out.println(monkey);
    }
    public static void dogResult(){
        System.out.println("///////Player Stats///////");
        System.out.println(dog);


    }
}

//Side noter:
//Du har sikkert lagt mærke til at der er en alive boolean som ikke virkelig bliver ændret på, det var meningen
//at hvis energy skulle blive for lav, ville ens Tamagachi bare dø, men virkede lidt trist at have med, så den er
//bare constant alive=true.


