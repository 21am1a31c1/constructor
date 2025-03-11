package guru_master;

public class Car {
    String speedOfCar() {
        return "0kmph";
    }
}

class Audi extends Car {
    @Override
    String speedOfCar() {
        return "200 kmph";
    }
}

class Jaguar extends Car {
    @Override
    String speedOfCar() {
        return "250 kmph";
    }
}

class KIA extends Car {
    @Override
    String speedOfCar() {
        return "300 kmph";
    }
}

