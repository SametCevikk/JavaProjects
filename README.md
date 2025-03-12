# Basic Level Java Projects
--------------------------
## Body Index Calculator 🏋️‍♂️  

A simple **Java console application** that calculates the **Body Mass Index (BMI)** based on user input.  

### 📌 How It Works  
1. The program prompts the user to enter their **height (in meters)** and **weight (in kilograms)**.  
2. It calculates the **BMI** using the formula:  
   ```java
   BMI = weight / (height * height);
3. The calculated BMI value is displayed on the console.

### 📜 Example Output

Please enter your height (in meters): 1.75  
Please enter your weight (in kg): 70  
Your Body Mass Index (BMI) is: 22.86

## Cash Register 🛒  

A simple **Java console application** that calculates the total cost of groceries based on user input.  

### 📌 How It Works  
1. The program prompts the user to enter the weight (in kg) of the following items:  
   - 🍐 Pear  
   - 🍏 Apple  
   - 🍅 Tomato  
   - 🍌 Banana  
   - 🍆 Aubergine  
2. It calculates the total cost using predefined **price per kg** values:  
   ```java
   double total = (pearKg * pear) + (appleKg * apple) + 
                  (tomatoKg * tomato) + (bananaKg * banana) + 
                  (aubergineKg * aubergine);
3. Finally, it displays the total amount to be paid.
4. 
### 📜 Example Output
Armut kaç kilo? 2  
Elma kaç kilo? 1  
Domates kaç kilo? 3  
Muz kaç kilo? 1  
Patlıcan kaç kilo? 2  
Toplam tutar = 23.58  

## Horoscope Calculator 🏮  

A simple **Java console application** that determines the **Chinese Zodiac sign** based on the user's birth year.  

### 📌 How It Works  
1. The program prompts the user to enter their **birth year**.  
2. It calculates the **Chinese Zodiac sign** using the formula:  
   ```java
   int zodiacSign = birthYear % 12;
3. Based on the result, the program displays the corresponding Chinese Zodiac sign.
 
### 📜 Example Output
Please enter your birth year: 1996  
Your Chinese Zodiac sign is: Rat  

## Leap Year Calculator 📆  

A simple **Java console application** that determines whether a given year is a **leap year** or not.  

### 📌 How It Works  
1. The program prompts the user to enter a **year**.  
2. It checks if the year is a leap year using the following conditions:  
   - A year is a **leap year** if:  
     - It is divisible by **4** but **not** by **100**, **or**  
     - It is divisible by **400**  
   ```java
   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
       System.out.println(year + " is a leap year.");
   } else {
       System.out.println(year + " is not a leap year
3. The program then displays whether the input year is a leap year or not.
   
### 📜 Example Output
Please enter a year: 2024  
2024 is a leap year.  

Please enter a year: 2023  
2023 is not a leap year.  

## Matrix Transpose Calculator 🧮  

A simple **Java console application** that calculates the **transpose** of a given matrix.  

### 📌 How It Works  
1. The program defines a **2x3 matrix**:  
   ```java
   int matrix[][] = {{2, 5, 8}, {3, 7, 1}};
2. It initializes an empty 3x2 transposed matrix.
3. It iterates through the matrix and swaps rows with columns to compute the transpose:
   ```java
   transpoze[j][i] = matrix[i][j];
4. Finally, it prints both the original matrix and its transposed version.

### 📜 Example Output
Matris  
2 5 8  
3 7 1  

Matrisin Transpozu  
2 3  
5 7  
8 1  

## Number Calculator 🔢  

A simple **Java console application** that calculates the **average of numbers** divisible by **3 and 4** up to a given number.  

### 📌 How It Works  
1. The program prompts the user to enter a **number**.  
2. It iterates from **1 to the given number** and checks which numbers are **divisible by both 3 and 4**.  
3. It sums up these numbers and counts how many exist.  
4. It calculates the **average** using:  
   ```java
   double result = total / counter;
5. Finally, it displays the average value.

### 📜 Example Output  
Bir sayı giriniz: 30  
Sayının 3 ve 4'e tam bölünen katlarının ortalaması: 18.0  

## Perfect Number Calculator 🔍  

A simple **Java console application** that checks whether a given number is a **perfect number**.  

### 📌 How It Works  
1. The program prompts the user to enter a **number**.  
2. It calculates the sum of all **divisors** of the number (excluding the number itself).  
3. If the sum of the divisors equals the number, it is considered a **perfect number**.  
4. The program displays whether the number is a **perfect number** or not.  
   ```java
   if (total == number) {
       System.out.println(number + " is a perfect number.");
   } else {
       System.out.println(number + " is not a perfect number.");
   }
   
### 📜 Example Output  
Bir sayı giriniz: 6  
6 sayısı mükemmel sayıdır  

Bir sayı giriniz: 10  
10 sayısı mükemmel sayı değildir  

## Processing Priority Calculator 🔢  

A simple **Java console application** that calculates the result of a mathematical expression by following the proper **operator precedence**.  

### 📌 How It Works  
1. The program prompts the user to enter **three numbers**.  
2. It calculates the result of the expression:  
   \[
   \text{result} = \text{number1} + (\text{number2} \times \text{number3}) - \text{number2}
   \]
   The multiplication between `number2` and `number3` is performed first due to operator precedence.  
3. The program displays the **calculated result**.  

### 📜 Example Output  
Sayı giriniz: 5  
Sayı giriniz: 3  
Sayı giriniz: 2  
İşlem sonucu: 7  

## Triangle Pattern Generator 🔺

A simple **Java console application** that generates a **triangle pattern** using asterisks (`*`).

### 📌 How It Works  
1. The program prompts the user to enter the number of **rows** (height) of the triangle.  
2. It prints the triangle pattern by reducing the number of `*` in each row:  
   - The first row will have the maximum number of stars.  
   - Each subsequent row will have one less star than the previous one, forming an inverted triangle.  
   
   Example for `number = 5`:  
3. The program uses a **nested loop** to print the pattern.

### 📜 Example Output 
    ```
    Üçgen kaç katlı olsun: 5
    *****  
    ****  
    ***  
    **  
    *  


## Type Casting in Java 🔄

A simple **Java console application** that demonstrates **type casting** between **integer** and **double** data types.

### 📌 How It Works  
1. The program prompts the user to enter a **integer number** and a **floating-point (double) number**.  
2. It performs **automatic type casting** from `int` to `double` (implicit casting).  
3. It performs **manual type casting** from `double` to `int` (explicit casting).  
4. The program then prints the **converted values**.  

#### Type Casting Explained:
- **Automatic casting**: When a smaller data type (like `int`) is assigned to a larger data type (like `double`), no explicit conversion is needed. This is done **implicitly** by Java.  
- **Manual casting**: When a larger data type (like `double`) is assigned to a smaller data type (like `int`), you need to explicitly convert the type using the `(int)` syntax. This may result in data loss (decimal part).

  ```java
  double changedIntegerNumber = integerNumber; // Implicit casting
  int changedDoubleNumber = (int) doubleNumber; // Explicit casting

### 📜 Example Output 
Lütfen bir tam sayı giriniz: 10  
Lütfen bir ondalıklı sayı giriniz: 5.67  
Değiştirilmiş tam sayının değeri: 10.0  
Değiştirilmiş ondalıklı sayının değeri: 5  



 




