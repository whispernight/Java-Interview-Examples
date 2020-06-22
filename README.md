# Intro
This project is meant to explain problems and solutions related to questions that appear normally during interviews

## Arrays and Strings
##### Question 1
>Given an array of integers, write a method to find indices m and n such that if you sorted elements m through n, the entire array would be
>sorted. Minimize n-m (find the smallest such sequence).
>EXAMPLE:
>input: 1, 2, 3, 4, 8, 7, 6, 5, 9, 10
>output: 4 7
##### Solution: [SubSort](/src/main/java/ArraysandStrings/SubSort.java)
##### Test: [SubSortTest](/src/test/java/ArraysandStrings/SubSortTest.java)


## Stacks and Queues
##### Question 1
>How would you use a single array to implement three stacks?
##### Solution: [FixedMultiStack](/src/main/java/StacksandQueues/FixedMultiStack.java)
##### Test: [FixedMultiStackTest](/src/test/java/StacksandQueues/FixedMultiStackTest.java)

##### Question 2
>How would you design a stack  which in addition to push and pop, has a function min which returns the minimum element? All should operate in O(1)
[Coming soon]

#### Question 3
>Implement a queue class using two stacks
##### Solution: [MyCustomQueue](/src/main/java/StacksandQueues/MyCustomQueue.java)
##### Test: [MyCustomQueueTest](/src/test/java/StacksandQueues/MyCustomQueueTest.java)

#### Question 4
>An animal shelter holds only dogs and cats. It operates on a 'first in first out' basis. Create the data structures
>for the system and implement the basic functions.
##### Solution: [AnimalShelter](/src/main/java/StacksandQueues/AnimalShelter.java)
##### Test: [AnimalShelterTest](/src/test/java/StacksandQueues/AnimalShelterTest.java)
