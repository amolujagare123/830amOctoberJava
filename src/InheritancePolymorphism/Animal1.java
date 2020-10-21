package InheritancePolymorphism;

public class Animal1 {

    public void eat()
    {
        System.out.println("eat");
    }
}

class Dog1 extends Animal1
{
    public void bark()
    {
        System.out.println("bark");
    }
}

class BabyDog extends Dog1
{
    public void weep()
    {
        System.out.println("weep");
    }
}


class  TestInheritance
{

    public static void main(String[] args) {

        Animal1 a = new Animal1();
        a.eat();

        Dog1 d = new Dog1();
        d.bark();
        d.eat();


        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();

    }
}