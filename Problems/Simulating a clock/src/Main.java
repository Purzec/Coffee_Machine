class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        this.minutes = minutes + 1;
        if (minutes == 60) {
            if (hours == 12) {
                hours = 1;
                minutes=0;
            } else {
                this.hours = hours + 1;
                minutes = 0;
            }
        }

    }


}