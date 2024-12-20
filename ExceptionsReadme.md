## Java Exception Handling Examples ##
This repository contains Java programs that demonstrate common exception handling mechanisms in Java. Each program showcases how a specific exception is triggered and handled. Below is a summary of the exceptions covered and the relevant details for each one.

>>>Description:
This exception occurs when an illegal arithmetic operation is performed, such as dividing by zero.

>>>Example:
In the program, 10 / 0 triggers an ArithmeticException, which is caught and handled.

```java

int result = 10 / 0; // Division by zero
ArrayIndexOutOfBoundsException
Description:
This exception is thrown when an attempt is made to access an invalid index in an array.

>>>Example:
In the program, we attempt to access an array element at an index that is out of bounds (arr[5] in a 3-element array).

```java

int[] arr = {1, 2, 3};
int invalidElement = arr[5]; // Index out of bounds
ClassCastException
Description:
This exception occurs when an object is cast to a type that it is not an instance of.

>>>Example:
In the program, we attempt to cast an array of integers (new int[42]) to a String, which results in a ClassCastException.

java

Object obj = new int[42];
String str = (String) obj; // Invalid type cast
ClassNotFoundException
Description:
This exception is thrown when an attempt is made to load a class that cannot be found.

>>>Example:
The program tries to load a non-existent class using Class.forName(), which causes a ClassNotFoundException.

java

Class.forName("com.nonexistent.Class"); // Class not found
EOFException
Description:
This exception occurs when trying to read past the end of a file using an ObjectInputStream.

>>>Example:
In the program, we attempt to read from an empty file using ObjectInputStream.readObject(), which triggers an EOFException.

java

ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empty_file.txt"));
ois.readObject(); // Read past the end of file
FileNotFoundException
Description:
This exception is thrown when an attempt is made to open a file that does not exist.

Example:
The program tries to open a file (missing_file.txt) that doesn't exist, triggering a FileNotFoundException.

java

FileInputStream file = new FileInputStream("missing_file.txt"); // File not found
IOException
Description:
This general exception is thrown when an input or output operation fails or is interrupted.

Example:
In the program, we attempt to read from a non-existent file using BufferedReader.readLine(), causing an IOException.

java

BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));
reader.readLine(); // IOException
IllegalArgumentException
Description:
This exception occurs when a method receives an illegal or inappropriate argument.

Example:
In the program, we pass an invalid argument (-1000) to Thread.sleep(), which causes an IllegalArgumentException.

java

Thread.sleep(-1000); // Invalid argument
NullPointerException
Description:
This exception occurs when an attempt is made to access or modify an object that is null.

Example:
In the program, we attempt to call the length() method on a null string reference, which causes a NullPointerException.

java

String str = null;
str.length(); // NullPointerException
NumberFormatException
Description:
This exception is thrown when a string cannot be parsed into a valid number (integer, float, etc.).

Example:
The program attempts to parse the string "not_a_number" into an integer, causing a NumberFormatException.

java

int number = Integer.parseInt("not_a_number"); // Invalid string
SQLException
Description:
This exception occurs when an SQL operation fails, such as an invalid query or database connection issue.

Example:
In the program, we attempt to connect to a non-existent database (nonexistentdb), which triggers a SQLException.

java

Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
Conclusion
This repository demonstrates common Java exceptions that developers encounter while working with databases, files, and objects. The examples are intended to help understand how exceptions are triggered and how they can be handled effectively in real-world applications.

