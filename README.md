# SPRINT 1
## TASK 3: Collections

### LEVEL 1 - EXERCISE 1
Create a class called Month with an attribute "name" 
(which will store the name of the month of the year). 
Add 11 Month objects (each with its own attribute) to an ArrayList, 
except for the object with the attribute "August". 
Then, insert it into the place corresponding to that 
month and show that the ArrayList maintains the correct order.

Convert the ArrayList from the previous exercise to a 
HashSet and make sure that it does not allow duplicates.

Iterate over the list with a for loop and an iterator.

### LEVEL 1 - EXERCISE 2
Create and populate a List<Integer>.

Create a second List<Integer> and insert the elements of the 
first list into the second list in reverse order.

Use ListIterator objects to read the elements of the first 
list and insert them into the second list.

### LEVEL 1 - EXERCISE 3
Given the file countrties.txt that contains countries and capitals. 
The program must read the file and save the data in a 
HashMap<String, String>. The program asks for the user's name, 
and then it must display a country randomly, saved in the HashMap. 
The user must write the name of the capital of the country in question. 
If they get it right, they are given a point. This action is repeated 10 
times. Once the capitals of 10 countries have been asked for randomly, 
then the user's name and their score must be saved in a file called 
classificacio.txt.

### LEVEL 2 - EXERCISE 1
Create a class called Restaurant with two attributes: name(String) 
and score(int). Implement the necessary methods so that 
Restaurant objects with the same name and score cannot be inserted 
into a HashSet created in the application's main().

There can be restaurants with the same name with different scores, 
but there cannot be restaurants with the same name and score.

### LEVEL 2 - EXERCISE 2

### TECHNOLOGIES
| Package     | Version    | Description                |
|-------------|------------|----------------------------|
| `java`      | ^1.8.0_441 | Principal project language |
| `java.util` | ^1.8.0_441 | Java standard library   |
| `java.io`   | ^1.8.0_441 | Java standard library   |

### REQUIREMENTS
Local environment: `IntelliJ or Eclipse`

### EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.