import java.util.Random;
import java.util.Scanner;
//Vores navn på classen og informationen at den extender på den anden classe "Tomagachi"
public class Dog extends Tomagachi {
    //Vores ekstra attributes for denne classe
    public boolean bark;
    public int dogActivities;

    Random random = new Random ();

    //Construktoren for classen "Dog", med en super for "Tomagachi"
    public Dog(String name, int age, int mood, boolean dirty,boolean alive, boolean bark) {
        super(name, age, mood, dirty, alive);
        this.bark = bark;
        this.dogActivities = random.nextInt(5);
    }


    @Override
    public void feed(){
        if(this.energy < 50){
            this.energy += 50;
            System.out.println(this.name+" liked the meal you have given (+50 Energy)");
            System.out.println(this.energy);
        }
        else{
            System.out.println(name+ " dont want to be a chonker, so he refused to over eat");
        }
    }

    //Det samme som i "Monki" bare med en ekstra gimmick.
    public void playWithDog(){

        this.dogActivities = random.nextInt(3);

        if(energy > 20) {

            if (this.dogActivities == 0) {
                System.out.println("You and "+this.name+" played fetch, but he forget where the stick went" +
                        " none the less "+this.name+" had fun");
                this.mood +=5;
            } else if (this.dogActivities == 1) {


                //Hvis spilleren skulle få denne ville deres objekt også blive "dirty", hvilket er (i spil terms)
                //en negativ effekt, som kræver at spilleren gør noget for at få den væk, ellers skader det dem indtil
                //der er fået styr på det.
            } else if (this.dogActivities == 2){
                System.out.println("You and "+this.name+" played in the mud together, tho it was fun "+this.name+" is now a dirty" +
                        "boy (+Dirty)");
                this.mood += 5;
                this.dirty = true;
            }
        }
        else{
            System.out.println(this.name+" is too tired to do anything right now");
        }
    }

    //Hvis objekted skulle have en boolean "dirty" som er true, får de dette billede op, med en besked at deres objekt
    //nu er ren igen
    public void isDogSmelly() {
        if (this.dirty == true) {
            System.out.println("" +
                    "______________________$$$$$$$$\n" +
                    "_______________$$$$$$$________$$$$$$$$$\n" +
                    "_____________$$________________________$$$$\n" +
                    "____________$$_____________________________$$\n" +
                    "___________$__________________________________$$\n" +
                    "___________$$___________________________________$$\n" +
                    "__________$$__$$______________________$$__________$$\n" +
                    "________$$__$$___$$$$_________$$$$____$$__________$$$$\n" +
                    "______$$___$$__$$$$__$$_____$$$$__$$_$$_____________$$$\n" +
                    "______$$___$$____$$$$_________$$$$___$$_______________$$\n" +
                    "______$$___$$________________________$$_______________$$\n" +
                    "______$$____$$_______________________$$_____________$$\n" +
                    "________$$__$$____$$$$$$_____________$$___________$$$\n" +
                    "________$$__$$__$$______$$___________$$_________$$\n" +
                    "________$$__$$__$$______$$___________$$_______$$\n" +
                    "__________$$$$____$$$$$$_____________$$$$____$$$$\n" +
                    "__________$$$$_____________________$$__$$____$$$\n" +
                    "___________$$_$$$$$$$$$$$$_____$$$$______$$$$_$$\n" +
                    "_____________$$___$$______$$$$$_______________$$\n" +
                    "_____________$$_____$$$$$$$____________________$$\n" +
                    "____________$$___________________________________$$\n" +
                    "__________$$_________________________$$___________$\n" +
                    "__________$$__________$$___________$$_____________$$\n" +
                    "________$$__$$________$$_________$$_______________$$\n" +
                    "______$$____$$__________$$_______$$_______________$$\n" +
                    "______$$____$$____________$$___$$_________________$$\n" +
                    "____$$______$$_____________$$_$$_______$$_________$$\n" +
                    "____$$______$$________$$____$$$________$$_________$$\n" +
                    "____$$______$$________$$____$$$_______$$__________$$\n" +
                    "____$$______$$________$$_______________$$__________$$\n" +
                    "____$$______$$________$$_______________$$____________$\n" +
                    "_$$$$_______$$________$$_______________$$____________$$\n" +
                    "$___$$______$$________$$$$___________$$$$____________$$\n" +
                    "$___$$______$$________$$__$$_______$$__$$____________$$\n" +
                    "_$$$$$______$$________$$____$$___$$_____$$___________$$\n" +
                    "____$$______$$________$$______$$_______$$___________$$\n" +
                    "____$$______$$________$$_____$$________$$___________$$\n" +
                    "__$$________$$________$$$$$$$$___$$$$$$__$$_________$$\n" +
                    "__$$________$$________$$______$$$______$$$$_________$$\n" +
                    "$$________$$__________$$_________$$$$$$__$$__________$\n" +
                    "$$______$$__________$$$$$$$$$$$$$$$______$$__________$\n" +
                    "$$_$$_$$$__________$$_____________$$$$$$$__$$_________$\n" +
                    "_$$$$$$$___________$$______________________$$________$$\n" +
                    "_____$$__$$__$$__$$_$______________________$$__________$$\n" +
                    "______$$$$__$___$__$$______________________$$____________$\n" +
                    "_______$$___$___$__$________________________$$_$__$$__$$__$\n" +
                    "_________$$$$$$$$$$__________________________$$_$_$$$$$$$$\n" +
                    "");
            System.out.println(this.name + " liked the bath and the fact you take care of him (-Dirty)");
            this.dirty = false;
        }


    }

        //Simpel metode som skal give en sout sætning.
        public void dogSpeak(){
            System.out.println(this.name+": Bark!");
        }

        //I forhold til "Monkis" randomstuff metode, er der sat mere ind på denne af muligheder + en boolean der kan blive
        //true hvis spilleren ønsker det.
        public void randomStuffDog(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("What other stuff would you like to do? (Does not affect pets opinion on you, or maybe)");
            System.out.println("\n1 - Goodbye children"+"\n2 - Ask dog opinion on JAVA"+"\n3 - What the dog doing tho?");
            int userInput = scanner.nextInt();

            if(userInput == 1){
                System.out.println("You take "+this.name+" to the vet to......you know." +
                        " Remove his stuff.");
                System.out.println(this.name+ " Will remember that");
                this.bark = false;

            }
            else if(userInput == 2){
                System.out.println("You ask the dog whats its opinion on the well known computer language JAVA.");
                System.out.println(this.name+" does not respond, cause he is a dog.");
            }

            else if(userInput == 3){
                System.out.println("What do the dog be doing tho?");
            }

        }
    //Metode for alt der skal ske ved slutningen af en dag
    public void endOfDayDog(){
        if(this.energy > 10) {
            this.energy -= 15;
        }
        if(this.dirty){
            System.out.println(this.name + " is dirty and is now feeling sad over it looks (-1 Mood)");
        }
        if(this.mood > 0){
            this.mood -=1;}
    }

    @Override
    //Objekt stats.
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                ", dirty=" + dirty +
                ", alive=" + alive +
                '}';
    }
}

