class CarDriver {
    public static void main(String[] args) {
        Engine eng = new Engine("Diesel", 150);
        Car car = new Car("Tata", "Safari", 1800000, eng);

        car.showCarDetails();
    }
}
class Engine {
    String type;
    int horsepower;

    Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    void showEngineDetails() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsepower + " HP");
    }
}

class Car {
    String brand;
    String model;
    double price;
    Engine engine; // Composition - Car has an Engine

    Car(String brand, String model, double price, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    void showCarDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        engine.showEngineDetails(); // Calling Engine's method
    }
}
