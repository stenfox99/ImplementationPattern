package parentClasses;

public final class Dog {
    private static Dog dog = null;

    private Dog(){}

    public static Dog getDog(){
        if (dog == null){
            dog = new Dog();
        }
        return dog;
    }
}
