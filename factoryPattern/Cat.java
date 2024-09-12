package factoryPattern;

public class Cat implements Pet {
    private Integer noOfLives;

    public Cat() {
        this.noOfLives = 9;  // Cats typically have 9 lives.
    }

    public Integer getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
    }

    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    @Override
    public String play() {
        return "Catching/pursuing moving objects!";
    }

    public String showLives() {
        return "The cat has " + noOfLives + " lives.";
    }
}
