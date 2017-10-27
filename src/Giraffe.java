public class Giraffe extends Animal{

    public Giraffe(String name){
        super(name, "leaves");
    }

    public void eat(String food) {
        System.out.print(name + " eats " + food + "\n");
        if (food.equals(favoriteFood)){
            System.out.print("Yum " + name + " wants more " + food + "\n");
        }else{
            System.out.print("YUCK!!! " + name + " will not eat " + food + "\n");
        }

    }


}
