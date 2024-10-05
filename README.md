# Java Data Structures Project

## Project Overview

This project is a collection of fundamental data structures implemented from scratch in Java. Each data structure is designed with efficiency and modularity in mind, providing a variety of operations commonly used in software development. The data structures implemented include a dynamic array, binary search tree (BST) with level-order traversal, doubly-linked list, hash table with separate chaining for collision handling, queue, and stack.

## Data Structures Implemented

### 1. Dynamic Array

A resizable array that automatically grows as elements are added, mimicking the functionality of ArrayList in Java.

#### Methods:

add(element) - Adds an element to the array.

get(index) - Retrieves the element at the given index.

remove(index) - Removes the element at the given index.

size() - Returns the current number of elements in the array.

Internal workings: Dynamically resizes when the capacity is reached.

...


### 2. Binary Search Tree (BST) with Level-Order Traversal

A tree data structure where each node has at most two children, and for each node, the left subtree contains values smaller than the node's value, and the right subtree contains values greater than the node's value.

#### Methods:

insert(value) - Inserts a value into the tree.

search(value) - Searches for a value in the tree.

delete(value) - Deletes a node with the given value.

levelOrderTraversal() - Traverses the tree in level-order (breadth-first).

Internal workings: Uses recursive insertion and deletion.

...


### 3. Doubly-Linked List

A linked list where each node has a reference to both the next and previous nodes, allowing traversal in both directions.

#### Methods:

addFirst(value) - Adds an element to the start of the list.

addLast(value) - Adds an element to the end of the list.

removeFirst() - Removes the first element.

removeLast() - Removes the last element.

get(index) - Retrieves the element at the specified index.

size() - Returns the current size of the list.

...


### 4. Hash Table with Separate Chaining (to resolve collisions)

A hash table that maps keys to values using a hash function and handles collisions using separate chaining (each bucket is a linked list of key-value pairs).

#### Methods:

put(key, value) - Inserts a key-value pair into the table.

get(key) - Retrieves the value associated with the key.

remove(key) - Removes the key-value pair from the table.

Internal workings: Uses separate chaining to handle collisions.

...



### 5. Queue

A first-in, first-out (FIFO) data structure where elements are added to the end and removed from the front.

#### Methods:

enqueue(value) - Adds an element to the end of the queue.

dequeue() - Removes and returns the element at the front of the queue.

peek() - Returns the element at the front without removing it.

isEmpty() - Checks if the queue is empty.

...



### 6. Stack

A last-in, first-out (LIFO) data structure where elements are added and removed from the top of the stack.

#### Methods:

push(value) - Adds an element to the top of the stack.

pop() - Removes and returns the element at the top of the stack.

peek() - Returns the element at the top without removing it.

isEmpty() - Checks if the stack is empty.

...


## How to Use

1. Clone the repository:

git clone https://github.com/yourusername/yourrepository.git


2. Import the project into your Java IDE.


3. Run the Main class to test the functionality of different data structures.



## Example Usage

Here’s a simple example demonstrating the use of the dynamic array and the binary search tree:
```java
// Example usage of the Dynamic Array
dynamicArray<Integer> DynamicArray = new DynamicArray<>();

DynamicArray.add(10);
        
DynamicArray.add(20);
        
System.out.println("Element at index 1: " + DynamicArray.get(1)); // Output: 20

// Example usage of Binary Search Tree
 binarySearchTree<Integer>bst=new binarySearchTree<>();

bst.insert(50);

bst.insert(30);

bst.insert(70);

System.out.println(bst); // Output: 50 30 70
```
## Contributing

Contributions are welcome! Feel free to fork the repository, make improvements, and submit a pull request.
