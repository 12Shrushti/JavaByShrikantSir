import java.util.*;

class Driver {
    public static void main(String[] args) {
        Bag bag = new Bag("American Tourister", "HandBag", 35, 5, 1500, "Blue", "Cotton");

        // Add books
        bag.addBook("NoteBook", "JAVA", "Classmate", 400, "A4", 70);
        bag.addBook("NoteBook", "SQL", "Classmate", 200, "A4", 55);
        bag.addBook("NoteBook", "WebTech", "Navneet", 300, "A4", 60);

        bag.displayBag();

        for (Book ele : bag.listBook) {
            ele.displayBook();
        }

        // Add pens
        bag.addPen("Ball Pen", "PenTek", 10, "Black");
        bag.addPen("Gel Pen", "PenTek", 10, "Red");
        bag.addPen("Ball Pen", "PenTek", 10, "Blue");

        for (Pen ele : bag.listPen) {
            ele.displayPen();
        }

        // Add laptop
        bag.addLaptop("HP", "Pavilion", 70000);
        bag.laptop.displayLaptop();

        // Add water bottle
        bag.addWaterBottle("Steel", "Milton", 1, 150);
        bag.bottle.displayBottle();
    }
}

// ---------------- Bag Class ----------------
class Bag {
    String brand;
    String type;
    double litre;
    int comp;
    double price;
    String color;
    String material;
    int bookCount = 0;
    ArrayList<Book> listBook = new ArrayList<>();
    ArrayList<Pen> listPen = new ArrayList<>();
    Laptop laptop;
    Bottle bottle;

    Bag(String brand, String type, double litre, int comp, double price, String color, String material) {
        this.brand = brand;
        this.type = type;
        this.litre = litre;
        this.comp = comp;
        this.price = price;
        this.color = color;
        this.material = material;
    }

    public void displayBag() {
        System.out.println("\n--- Bag Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Litre: " + litre);
        System.out.println("Compartments: " + comp);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }

    public void addBook(String type, String subject, String brand, int pages, String size, double price) {
        if (bookCount == 10) {
            System.out.println("Cannot add more books. Bag is full.");
            return;
        }
        Book book = new Book(type, brand, subject, size, pages, price);
        listBook.add(book);
        bookCount++;
    }

    public void addPen(String type, String brand, double price, String color) {
        Pen pen = new Pen(brand, type, color, price);
        listPen.add(pen);
    }

    public void addWaterBottle(String material, String brand, int capacity, double price) {
        bottle = new Bottle(material, capacity, brand, price);
    }

    public void addLaptop(String brand, String model, double price) {
        laptop = new Laptop(brand, model, price);
    }
}

// ---------------- Book Class ----------------
class Book {
    String type;
    String brand;
    String subject;
    String size;
    int pages;
    double price;

    Book(String type, String brand, String subject, String size, int pages, double price) {
        this.type = type;
        this.brand = brand;
        this.subject = subject;
        this.size = size;
        this.pages = pages;
        this.price = price;
    }

    public void displayBook() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Subject: " + subject);
        System.out.println("Size: " + size);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);
    }
}

// ---------------- Laptop Class ----------------
class Laptop {
    String brand;
    String model;
    double price;

    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayLaptop() {
        System.out.println("\n--- Laptop Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

// ---------------- Pen Class ----------------
class Pen {
    String brand;
    String type;
    String color;
    double price;

    Pen(String brand, String type, String color, double price) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public void displayPen() {
        System.out.println("\n--- Pen Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

// ---------------- Bottle Class ----------------
class Bottle {
    String material;
    double capacity;
    String brand;
    double price;

    Bottle(String material, double capacity, String brand, double price) {
        this.material = material;
        this.capacity = capacity;
        this.brand = brand;
        this.price = price;
    }

    public void displayBottle() {
        System.out.println("\n--- Bottle Details ---");
        System.out.println("Material: " + material);
        System.out.println("Capacity: " + capacity + " L");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
