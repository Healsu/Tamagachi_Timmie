import java.util.Random;

//Dette er vores "main" classe. Den indenholder de forskellige attributes som både "Monki" og "Dog" skal have ud
//fra en extender, som giver os alt som disse to Tomagachi har tilfælles af stats.
public class Tomagachi {
    public String name;
    public int age;
    public int mood;
    public int energy;
    public boolean dirty;
    public boolean alive;

    //En construktor for alle vores attributes
    public Tomagachi(String name, int age, int mood, boolean dirty, boolean alive) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.dirty = dirty;
        this.alive = alive;
        Random random = new Random();
        this.energy = random.nextInt(50);
        this.energy += 50;
    }
    //En feed metode som ikke bliver brugt her, men viser hvordan @Override virker på de andre to classer, som bliver
    //extendet på.
public void feed(){

}
    }

