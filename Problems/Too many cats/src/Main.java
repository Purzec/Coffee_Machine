class Cat {

    String name;
    int age;
    static int counter;
    // write static and instance variables

    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;

        // do not forget to check the number of cats
        this.counter += 1;
    }

    public static int getNumberOfCats() {
        // implement the static method
        if (counter > 5) {
            for (int i = 5; i < counter; i++) {
                System.out.println("You have too many cats");
            }

        }

        return counter;
    }
}