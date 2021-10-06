import java.util.Scanner;
import java.util.Random;

//Vi har vores classe navn og at vi extender fra classen "Tomagachi"
public class Monki extends Tomagachi {
    //Vores extra attributes (og objekt) som kun kommer til at foregå i classen "Monki"
    public int monkeyActivities;
    public Random random = new Random();

    Scanner scanner = new Scanner(System.in);

    //Vores construktor for de forskellige attributes vi gerne vil have at vide for objekted der bliver lavet i main
    //sammen med en super for hvad vi har extended fra classen "Tomagachi"
    public Monki(String name, int age, int mood, boolean dirty, boolean alive) {
        super(name, age, mood, dirty, alive);
        this.monkeyActivities = random.nextInt(5);
    }

    //Siden vi har flere metoder med navnet "feed", skal vi @Override den så de ikke går ind over hinanden når vi beskriver et
    //bestem objekt
    @Override
    //Metoden feed for at fodre objekted når dens energy er mindre end 50
    public void feed() {
        if(this.energy < 50){
        this.energy += 50;
        System.out.println(this.name+" liked the meal you have given (+50 Energy)");
            System.out.println(this.energy);
     }
        else{
            System.out.println(name+ " dont want to be a chonker, so he refused to over eat");
        }
    }

    //Vores playWithMonki giver et tilfældig index tal fra 0 til 2, som så beslutter hvilken aktivitet du laver sammen
    //med objekted
    public void playWithMonki(){
    this.monkeyActivities = random.nextInt(3);
    //Så man ikke bare kan spamme dette, er der en "requirement" for hvis man kan bruge denne metode. Altså at objekteds
        // energi ikke må være under 20.
    if(energy > 20) {
        if (this.monkeyActivities == 0) {
            System.out.println("You and " + this.name + " played League of legends (+3 Mood)");
            this.mood += 3;
        } else if (this.monkeyActivities == 1) {
            System.out.println("You and " + this.name + " drew something together. How nice :) (+5 Mood)");
            this.mood += 5;
            System.out.println("" +
                    "───▄██▄─────────────▄▄\n" +
                    "──█████▄▄▄▄───────▄▀\n" +
                    "────▀██▀▀████▄───▄▀\n" +
                    "───▄█▀▄██▄████▄─▄█\n" +
                    "▄▄█▀▄▄█─▀████▀██▀\n" +
                    "- By " + this.name);
        } else if (this.monkeyActivities == 2){
            System.out.println("You and "+this.name+" had a staring contest (+4 Mood)");
            this.mood +=4;
        }
    }
    else{
        System.out.println(name+" is too tired to do anything right now");
        }
    }

    //En gætte leg med aben som igen i metoden før laver et tilfældig tal fra 0-2 som spilleren så skal gætte.
    public void gussWithMonkey(){
        Random monkeyGuessGame = new Random();
        int monkeyGuess = monkeyGuessGame.nextInt(4);
        //Men siden vi gerne vil have at man kan gætte fra 1-3, så har vi plusset vores int med 1 så i stedet for 0-2
        //er det 1-3 fordi vi har tilføjet en ekstra plads.
        monkeyGuess +=1;

        System.out.println(name+" will guess a number from 1 to 3, if can guess the same as him you will give him 10 points in mood" +
                "\nThough if your wrong it might make him angry and lose some instead");

        System.out.println("Now guess mortal");
        int userGuess = scanner.nextInt();

        if(userGuess == monkeyGuess){
            System.out.println("You guessed the same as "+name+" his mood was increased (+10 Mood)");
            mood += 10;
        }
        else{
            System.out.println(name+": How dare you human guess wrong, stupid human >:(  (-5 Mood)");
            mood -=5;
        }
    }

    //simpel metode for en sout sætning
    public void monkiSpeak(){
        System.out.println(this.name+ ": 'Monkey gibberish'");
    }

    //en anden simpel metode igen for en sout sætning, som bliver bygget lidt videre på i classen "dog"
    public void randomStuffMonkey(){
        System.out.println(this.name+" is too smart to do random stuff with such small minded fools as you.");
    }

    //Metode for alt der skal ske ved slutningen af en dag
    public void endOfDayMonki(){
        if(this.energy > 10) {
            this.energy -= 21;
        }
        if(this.mood > 0){
            this.mood -=1;
        }
    }

    @Override
    //Vores information som fortæller alt hvad vi har brug for at vide om objekted der var lavet i mainen, som vi kalder
    //når man skal checke til sin Tamagachi stats.
    public String toString() {
        return "Monki{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                ", alive=" + alive +
                '}';
    }
}
