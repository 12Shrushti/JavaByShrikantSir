import java.util.*;

class AtmDriver {
    public static void main(String[] args) {
        ATM atm = new ATM("HDFC", "Main Branch", "Mumbai", 12345, 500000.0, "Active", "ModelX");

        atm.addCard("Debit", "HDFC", "1234-5678-9876-5432", "John Doe", "12/27", 100000.0);
        atm.addCard("Credit", "HDFC", "9876-5432-1234-5678", "Jane Smith", "11/26", 50000.0);

        atm.displayATM();

        for (Card c : atm.cardList) {
            c.displayCard();
        }

        atm.addTransaction("Withdrawal", 5000.0, "Successful", "Mumbai", "2025-04-19");
        atm.addTransaction("Deposit", 10000.0, "Successful", "Mumbai", "2025-04-19");

        for (Transaction t : atm.transactionList) {
            t.displayTransaction();
        }

        atm.addReceipt("ATM Withdrawal", 5000.0, "2025-04-19", "Mumbai");
        atm.receipt.displayReceipt();

        atm.addBank("HDFC", "HDFC001", "Mumbai", 1234.56);
        atm.bank.displayBank();
    }
}

// ---------------- ATM Class ----------------
class ATM {
    String bankName;
    String branch;
    String location;
    int atmId;
    double cashAvailable;
    String status;
    String model;
    ArrayList<Card> cardList = new ArrayList<>();
    ArrayList<Transaction> transactionList = new ArrayList<>();
    Receipt receipt;
    Bank bank;

    ATM(String bankName, String branch, String location, int atmId, double cashAvailable, String status, String model) {
        this.bankName = bankName;
        this.branch = branch;
        this.location = location;
        this.atmId = atmId;
        this.cashAvailable = cashAvailable;
        this.status = status;
        this.model = model;
    }

    public void displayATM() {
        System.out.println("\n--- ATM Details ---");
        System.out.println("Bank: " + bankName);
        System.out.println("Branch: " + branch);
        System.out.println("Location: " + location);
        System.out.println("ATM ID: " + atmId);
        System.out.println("Cash Available: ₹" + cashAvailable);
        System.out.println("Status: " + status);
        System.out.println("Model: " + model);
    }

    public void addCard(String type, String bank, String number, String holder, String expiry, double balance) {
        Card card = new Card(type, bank, number, holder, expiry, balance);
        cardList.add(card);
    }

    public void addTransaction(String type, double amount, String status, String location, String date) {
        Transaction tx = new Transaction(type, amount, status, location, date);
        transactionList.add(tx);
    }

    public void addReceipt(String type, double amount, String date, String location) {
        receipt = new Receipt(type, amount, date, location);
    }

    public void addBank(String name, String ifsc, String location, double interestRate) {
        bank = new Bank(name, ifsc, location, interestRate);
    }
}

// ---------------- Card Class ----------------
class Card {
    String type;
    String bank;
    String number;
    String holder;
    String expiry;
    double balance;

    Card(String type, String bank, String number, String holder, String expiry, double balance) {
        this.type = type;
        this.bank = bank;
        this.number = number;
        this.holder = holder;
        this.expiry = expiry;
        this.balance = balance;
    }

    public void displayCard() {
        System.out.println("\n--- Card Details ---");
        System.out.println("Type: " + type);
        System.out.println("Bank: " + bank);
        System.out.println("Number: " + number);
        System.out.println("Holder: " + holder);
        System.out.println("Expiry: " + expiry);
        System.out.println("Balance: ₹" + balance);
    }
}

// ---------------- Transaction Class ----------------
class Transaction {
    String type;
    double amount;
    String status;
    String location;
    String date;

    Transaction(String type, double amount, String status, String location, String date) {
        this.type = type;
        this.amount = amount;
        this.status = status;
        this.location = location;
        this.date = date;
    }

    public void displayTransaction() {
        System.out.println("\n--- Transaction Details ---");
        System.out.println("Type: " + type);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Status: " + status);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
    }
}

// ---------------- Receipt Class ----------------
class Receipt {
    String type;
    double amount;
    String date;
    String location;

    Receipt(String type, double amount, String date, String location) {
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.location = location;
    }

    public void displayReceipt() {
        System.out.println("\n--- Receipt ---");
        System.out.println("Transaction Type: " + type);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }
}

// ---------------- Bank Class ----------------
class Bank {
    String name;
    String ifscCode;
    String location;
    double interestRate;

    Bank(String name, String ifscCode, String location, double interestRate) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.location = location;
        this.interestRate = interestRate;
    }

    public void displayBank() {
        System.out.println("\n--- Bank Info ---");
        System.out.println("Name: " + name);
        System.out
