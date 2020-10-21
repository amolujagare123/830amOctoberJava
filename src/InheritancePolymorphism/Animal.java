package InheritancePolymorphism;

public class Animal {

     void eat()
    {
        System.out.println("eat");
    }

}


class Dog extends Animal
{


    public void bark()
    {
        System.out.println("bark");
    }


    public static void main(String[] args) {

        Dog ob = new Dog();

        ob.bark();
        ob.eat();
    }

}
