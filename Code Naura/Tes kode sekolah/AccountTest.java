// Latihan 2: Membuat kelas AccountTest dan objek CheckingAccount
// This is the main class that contains the entry point of the program.
public class AccountTest {

    // The main method is where the program execution begins.
    public static void main(String[] args) {
        // Create an object (instance) of the CheckingAccount class named billChecking.
        // This is based on page 15, "Buat objek CheckingAccount dari metode utama".
        CheckingAccount billChecking = new CheckingAccount();
        // Set the name and balance fields for the billChecking object.
        // This is based on page 15, "Tetapkan nilai untuk bidang balance dan name".
        billChecking.name = "Bill";
        billChecking.balance = 1000;

        // Create another object for Damian.
        CheckingAccount damianChecking = new CheckingAccount();
        damianChecking.name = "Damian";
        damianChecking.balance = 500;

        // Display the account data for Bill and Damian.
        // This uses System.out.println() to print the information to the terminal.
        System.out.println("Data Akun Bill:");
        System.out.println("Nama: " + billChecking.name);
        System.out.println("Saldo: " + billChecking.balance);
        System.out.println("\n--------------------------\n");

        System.out.println("Data Akun Damian:");
        System.out.println("Nama: " + damianChecking.name);
        System.out.println("Saldo: " + damianChecking.balance);
        System.out.println("\n--------------------------\n");

        // Latihan 3: Menambahkan metode withdraw() untuk penarikan
        // This section implements the logic from page 20, "Latihan 3".
        
        // Example of a valid withdrawal for Bill.
        System.out.println("Bill melakukan penarikan sebesar 200:");
        billChecking.withdraw(200);
        System.out.println("Saldo baru Bill: " + billChecking.balance);

        // Example of an invalid withdrawal for Damian (insufficient funds).
        System.out.println("\nDamian mencoba penarikan sebesar 1000:");
        damianChecking.withdraw(1000); // Saldo tidak cukup
        System.out.println("Saldo baru Damian: " + damianChecking.balance);

        // Example of an invalid withdrawal (negative amount).
        System.out.println("\nBill mencoba penarikan negatif sebesar -50:");
        billChecking.withdraw(-50);
        System.out.println("Saldo baru Bill: " + billChecking.balance);
    }
}

// The CheckingAccount class holds the data and methods for a bank account.
// This is created based on page 15, "Buat class CheckingAccount".
class CheckingAccount {
    // These are the instance variables (fields) for the class.
    public String name;
    public double balance;

    // This is the withdraw method from Latihan 3 (page 20).
    // It checks for valid withdrawal conditions before updating the balance.
    public void withdraw(double amount) {
        if (amount <= 0) {
            // Display a warning if the withdrawal amount is not positive.
            System.out.println("Peringatan: Penarikan harus lebih besar dari 0.");
        } else if (balance < amount) {
            // Display a warning if the balance is insufficient.
            System.out.println("Peringatan: Saldo tidak mencukupi untuk penarikan ini.");
        } else {
            // If valid, deduct the amount from the balance.
            balance -= amount;
        }
    }
}
    
    
