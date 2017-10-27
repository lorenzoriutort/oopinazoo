import java.util.ArrayList;

public class Zookeeper {
    String name;

    public Zookeeper(String name){
        this.name = name;
    }

    public void feedAnimals(ArrayList<Animal> animals, String food){
        int population = Animal.populationCount();
        System.out.println(name + " is feeding " + food + " to " + animals.size() + " of " + population + " animals");

        for(int i = 0; i<animals.size(); i++){
            Animal zeb = animals.get(i);
            zeb.eat(food);

        }
    }
}
