class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        this.speed += 5;
        // System.out.print(speed);
    }

    void brake() {
        if (speed <= 5) {
            this.speed = 0;
        } else {
            this.speed = speed - 5;
        }
        //System.out.println(speed);
    }

}