package InheritancePolymorphism;

public class Animal2 {

    public void iAmAnimal()
    {
        System.out.println("iAmAnimal");
    }
}

class Reptile extends Animal2
{
    public void iAmReptile()
    {
        System.out.println("iAmReptile");
    }
}

class Mamal extends  Animal2
{
    public void iAmMamal()
    {
        System.out.println("iAmMamal");
    }
}

class Dog2 extends Mamal
{
    public void iAmDog2()
    {
        System.out.println("iAmDog2");
    }
}

class  TestInheritance2
{
    public static void main(String[] args) {

        Animal2 a2 = new Animal2();
        a2.iAmAnimal();

        Mamal m = new Mamal();
        m.iAmMamal();
        m.iAmAnimal();

        Reptile r = new Reptile();
        r.iAmReptile();
        r.iAmAnimal();

        Dog2 d2 = new Dog2();
        d2.iAmDog2();
        d2.iAmMamal();
        d2.iAmAnimal();
    }
}