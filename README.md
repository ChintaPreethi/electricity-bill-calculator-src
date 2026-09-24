# ⚡ Electricity Bill Calculator

A simple Java console-based application that calculates an electricity bill based on the number of units consumed.

The program uses different rates for different electricity consumption levels and adds a fixed charge to calculate the final bill.

## ✨ Features

* 👤 Enter customer ID
* 🧑 Enter customer name
* ⚡ Enter electricity units consumed
* 📊 Calculate slab-based energy charges
* 💰 Add fixed charge
* 🧾 Display a formatted electricity bill
* ✅ Validate unit input

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Scanner
* Methods
* Conditional Statements
* Loops
* Arithmetic Operations

## 📁 Project Structure

```text
electricity-bill-calculator/
│
├── src/
│   ├── ElectricityBill.java
│   └── ElectricityBillCalculator.java
│
└── README.md
```

## 📊 Billing Slabs

| Units Consumed |       Rate |
| -------------- | ---------: |
| 0–100          | ₹1.50/unit |
| 101–200        | ₹2.50/unit |
| 201–500        | ₹4.00/unit |
| Above 500      | ₹6.00/unit |

A fixed charge of **₹100** is added to the energy charge.

## 🧮 Bill Calculation

```text
Energy Charge = Slab-based Unit Charges

Total Bill = Energy Charge + Fixed Charge
```

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 2. Open the project

```bash
cd electricity-bill-calculator
```

### 3. Navigate to the source folder

```bash
cd src
```

### 4. Compile the Java files

```bash
javac ElectricityBill.java ElectricityBillCalculator.java
```

### 5. Run the application

```bash
java ElectricityBillCalculator
```

## 💻 Example

```text
=================================
     ELECTRICITY BILL CALCULATOR
=================================

Enter customer ID: 101
Enter customer name: Afrin
Enter electricity units consumed: 350

=================================
       ELECTRICITY BILL
=================================
Customer ID   : 101
Customer Name : Afrin
Units Used    : 350.00
---------------------------------
Energy Charge : ₹950.00
Fixed Charge  : ₹100.00
---------------------------------
Total Bill    : ₹1050.00
=================================
```

## 🧠 Java Concepts Used

* Classes and Objects
* Constructors
* Encapsulation
* Private variables
* Methods
* `if-else` statements
* `while` loop
* `Scanner`
* Arithmetic calculations
* Formatted output

## 🚀 Future Improvements

* Multiple customer records
* Previous bill history
* Due date calculation
* Late payment charges
* Database integration
* GUI interface
* Monthly bill storage

## 👩‍💻 Author

**Preethi c**
