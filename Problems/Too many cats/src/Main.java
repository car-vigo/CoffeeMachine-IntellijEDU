class Cat {

    static int counter = 0;
    String name;
    int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        counter++;
    }

    public static int getNumberOfCats() {
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        return counter;
    }
}