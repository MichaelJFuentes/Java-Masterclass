package OOP.Room;

public class Person {
    private double height;
    private double weigth;
    private String bodyType;
    private String hairColor;
    private boolean isMale;
    private int age;
    private int hasHair;
    private String nationality;
    private double income;
    private boolean collegeGrad;
    private Position position;
    private double savings;
    private Shoes shoes;
    private boolean isAwake;

    public Person(double height, double weigth, String bodyType,
                  String hairColor, boolean isMale, int age,
                  int hasHair, String nationality, double income,
                  boolean collegeGrad, Position position, double savings)
    {
        this.height = height;
        this.weigth = weigth;
        this.bodyType = bodyType;
        this.hairColor = hairColor;
        this.isMale = isMale;
        this.age = age;
        this.hasHair = hasHair;
        this.nationality = nationality;
        this.income = income;
        this.collegeGrad = collegeGrad;
        this.position = position;
        this.savings = savings;

    }
    public Person(boolean isMale, int age) {
        this();
        this.isMale = false;

    }

    public Person() {
        this(170, 155, "normal", "black" , true, 22, 1, "American", 60000, true, new Position(0,0,0), 0);

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHasHair() {
        return hasHair;
    }

    public void setHasHair(int hasHair) {
        this.hasHair = hasHair;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public boolean isCollegeGrad() {
        return collegeGrad;
    }

    public void setCollegeGrad(boolean collegeGrad) {
        this.collegeGrad = collegeGrad;
    }

    public void talk() {
        System.out.println("Hello world");
    }

    public void talk(String message) {
        System.out.println(message);
    }

    public void spendMoney(double amount) {
        if (amount < 0  || amount > this.savings) {
            System.out.println("You can't buy something that is free");
        } else {
            this.savings -= amount;
            System.out.println("Item added to you inventory");
        }
    }

    public void setPosition(int x, int y, int z) {
        setPositionX(x);
        setPositionY(y);
        setPositionZ(z);
    }

    public void setPositionX(int xPosition) {
        position.setX(xPosition);
    }

    public void setPositionY(int yPosition) {
        position.setY(yPosition);
    }

    public void setPositionZ(int zPosition) {
        position.setZ(zPosition);
    }

    public void getPosition() {
        for (int axis: position.getPositions()) {
            System.out.println(axis);
        }
    }
    public void move(int x) {
        position.move(x);
    }

    public void move(int x, int y) {
        position.move(x,y);
    }

    public void move(int x, int y, int z) {
        position.move(x,y,z);
    }

    public void setAwake(boolean isAwake) {
        this.isAwake = isAwake;
    }

    public boolean isAwake() {
        return this.isAwake;
    }

    public void goToBed() {
        this.isAwake = false;
    }



    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weigth=" + weigth +
                ", bodyType='" + bodyType + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", isMale=" + isMale +
                ", age=" + age +
                ", hasHair=" + hasHair +
                ", nationality='" + nationality + '\'' +
                ", income=" + income +
                ", collegeGrad=" + collegeGrad +
                ", position=" + position +
                ", savings=" + savings +
                '}';
    }
}
