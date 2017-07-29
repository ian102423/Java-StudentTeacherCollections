# Student Teacher Collections Project
Assign sets of students to a map of teachers and students

For this activity you will be assigning Students to Teachers using `Lists`, `Sets` and a `Map`

# Getting Started  

Open up a new project in IntelliJ.

# Assignment  

Create a Student JavaBean (empty constructor and getters and setters)

- firstName<br>
- lastName<br>
- id<br>
- grade<br>

In the `main()` method of Main create an `ArrayList` of 15 students which represents all the 1st grade students at an elementary school. Make sure the ids are unique and set the grade to 1.

Generate `equals()`, `hashCode()` and `toString()` using IntelliJ. Re-write `equals()` and `hashCode()` to use the id variable.

The Teacher class is the same as the Student class (Hint: you could use this fact to save yourself some time) Teacher

- firstName<br>
- lastName<br>
- id<br>
- grade<br>

Instantiate 3 Teachers just like you did for Students and add to an `ArrayList` of teachers.

Code a `HashMap` that takes a Teacher for a key and a `Set` of students for the value (not a `List` of students). Each Teacher will have 5 different students in a `HashSet`.

Print out the map keys in a for loop (use the `keySet()` method). Print out the map values in a for loop (use the `values()` method).

# Extras  
Print out the map entries in a for loop (use the `entrySet()` method).