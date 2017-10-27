public class Animal {

    String name;
    String favoriteFood;
    static int population;

    public Animal(String name, String favoriteFood) {
        population += 1;
        this.favoriteFood = favoriteFood;
        this.name = name;

    }

    public static int populationCount(){
        return population;
    }

    public void sleep() {
        System.out.print(name + " sleeps for 8 hours" + "\n");
    }

    public void eat(String food) {
        System.out.print(name + " eats " + food + "\n");
        if (food.equals(favoriteFood)){
            System.out.print("Yum " + name + " wants more " + food + "\n");
        }
    }
}

