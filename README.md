# Assignment 1 

Name: Abdrakhmanova Aruzhan  
Group: IT-2501

## Content
- Part 1: Numbers(4 tasks)
- Part 2: Sequences(3 tasks)
- Part 3: Strings(3 tasks)


## How to run
* `run Main.java` 
* or click on "play"

# Output Examples
- ## 1st part
- task 1 

we need to take number and print each digit on a new line using recursion. 
first we check if this number is digit
`if (n < 10) {
System.out.println(n);
return;`
if the number has only one digit then we just return n.
each digit represents a power of 10. I putted 10 to get every number from the last to first.
then we 
`n/10` that removes the last digit and reduce the number step by step. `n%10` represents 
the last digit after n/10. 
![img.png](img.png)
![img_1.png](img_1.png)
- task 2

function sum calculates the average sum of all elements in an array. it recursively adds the last element of the array to the sum of the remaining 
element until it reaches `n==0`. and in main it calculates the average of array using recursion. i created an array `int[] arr = {3, 2, 4, 1};`, then call 
recursive function to calculate the sum of elements and used length command to take the number of elements. and then using System.out.println i calculated 
and printed the result. (double) sum/ arr.length. double to save decimal part.5
![img_2.png](img_2.png)
![img_3.png](img_3.png)

- task 3

this task checks whether a number is prime or not using recursion. in main i used ternary operator System.out.println(part1.isPrime(7, 2) ? "Prime" : "Composite"); 
that print Prime if true and vice versa. in function isPrime int i is the current divisor. base case: n<=2. 2 and 1 are prime and numbers less than 1 are not prime. 
`if (n % i == 0) return false;` so if number is divisible to i (in main initial i=2) then it is not prime. another base case `if (i * i > n) return true;` making i*i we checked 
up to sqrt n and found no divisors and this is prime. by return `isPrime(n, i+1)` we use recursion and check if it is prime starting with 2. if no divisor before 2nd base case
the number is prime.
![img_5.png](img_5.png)
![img_4.png](img_4.png)

- task 4

this function factorial calculayes the factorial of a number recursively. `public static long factorial(int n) {` return long to hold bigger numbers than int up to 20!. base case 
`if (n == 0) return 1;` because factorial of 0 and 1 = 1. `return n * factorial(n - 1);` call itself with n-1 reducing by one each line and multiplies the result by n and continues 
until n == 0.
![img_6.png](img_6.png)
![img_7.png](img_7.png)


- ## 2nd part
- task 5

function fib calculates the n-th fibonacci number recursively. `public static int fib(int n) {` method 
fib takes an integer n and returns the n-th fibonacci number. base cases `if (n == 0) return 0;` and 
`if (n == 1) return 1;` because by definition of fibonacci F0=0 and F1=1. recursive will never stop if we will 
not return a fixed number instead of callinf fib again and again. `return fib(n - 1) + fib(n - 2);` in fibonacci 
it calls itself for the 2 prev numbers and adds them together until n==1(base case).

![img_8.png](img_8.png)
![img_9.png](img_9.png)

- task 6

function power calculates a to the power of n using recursion. `public static int power(int a, int n) {` method power takes the base a, the exponent n. base case 
`if (n == 0) return 1;` because any number with exponent 0 is 1, no need in recursion. `return a * power(a, n - 1);` recursion. multiply the base a to the power(a, n-1) 
until n=0. in main `System.out.println(part2.power(2, 10));` calls power and multiplies 2 10 times until n=0
![img_10.png](img_10.png)
![img_11.png](img_11.png)

- task 7

function reverse prints an array in reverse order using recursion. `public static void reverse(int[] arr, int n) {` method reverse takes arr and n. base case `if (n == 0) return;` 
when n==0 there are no elements left to print, no need in recursion. `System.out.print(arr[n - 1] + " ");` for printing the last element before the recursive call. `reverse(arr, n - 1);`  
recursive call to reduce until base case. it is kind of similiar(print before recurive call) to the code from the first lesson
![img_12.png](img_12.png)
![img_13.png](img_13.png)

- ## 3rd part
- task 8

## Summary
In this assignment, I practiced recursion, including:
- base cases
- recursive calls
- working with arrays, numbers, and strings

All tasks work correctly.