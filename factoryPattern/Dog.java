package factoryPattern;

public class Dog implements Pet {
    private String breed;

    public Dog() {
        this.breed = "Labrador";  // Example breed.
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Aw, aw!";
    }

    @Override
    public String play() {
        return "Catching objects that you throw!";
    }

    public String showBreed() {
        return "The dog is a " + breed + ".";
    }
}
