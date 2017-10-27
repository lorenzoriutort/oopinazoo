public class Bee extends Animal{

    public Bee(String name){
        super(name, "pollen");
    }

    public void eat(String food) {
        System.out.print(name + " eats " + food + "\n");
        if (food.equals(favoriteFood)) {
            System.out.print("Yum " + name + " wants more " + food + "\n");
        } else if (food != "pollen") {
            System.out.print("YUCK!!! " + name + " will not eat " + food + "\n");
        }
    }
    public void sleep() {
        System.out.print(name + " never sleeps" + "\n");
        }


}
