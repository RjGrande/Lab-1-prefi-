import java.util.*;
public class RunAnimal{
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);

        //user input
        System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog: ");
        String choice = user.nextLine();

        if(choice.equalsIgnoreCase("B")){

            Bird bird = new Bird();

            bird.eat();
            bird.sleep();
            bird.makeSound();
        }
        else if(choice.equalsIgnoreCase("C")){

            Cat cat = new Cat();

            cat.eat();
            cat.sleep();
            cat.makeSound();
        }
        else if(choice.equalsIgnoreCase("D")){

            Dog dog = new Dog();

            dog.eat();
            dog.sleep();
            dog.makeSound();
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}