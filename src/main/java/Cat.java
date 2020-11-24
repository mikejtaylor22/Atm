public class Cat {

    private String name;
    private String furColor;
    private int age;
    private int lives;
    private int numberOfLivesLost = 2;
    public int input;

    public Cat(String inName, String inFurColor){
        name = inName;
        furColor = inFurColor;
        age =4;
        lives = 9;
    }

    public Cat(String name, String furColor, int age, int lives, int numberOfLivesLost) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.lives = lives;
        this.numberOfLivesLost = numberOfLivesLost;
    }

    public void greeting(){
        System.out.println("Im " + name +"! I have " + furColor + " fur. Im " + age + " years old, and I have " + lives + " lives left!" );
    }
    public int loseLives(){
        lives = lives - numberOfLivesLost;
        return lives;
    }

    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }
    public int getLives(){
        return lives;
    }
}
