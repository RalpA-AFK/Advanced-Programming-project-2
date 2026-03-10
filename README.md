Project 2
CSC 311 – Advanced Programming
Farmingdale State College
Computer Systems
Prof. Baci

Project Description
Build a generic class called DynamicArray that would be equivalent to Java’s ArrayList. Build the class according to this UML diagram:

DynamicArray<E>
   - array: E[]
   - size: int
   - capacity: int
   <<constructor>> DynamicArray()
   <<constructor>> DynamicArray(cap: int)
   + addFirst(e: E)
   + addLast(e: E)
   + insertAt(i: int, e: E)
   + removeFirst(): E
   + removeLast(): E
   + removeAt(i: int): E
   + getFirst(): E
   + get(i: int): E
   + set(i: int, newElem: E): E
   - doubleCapacity()
   - halveCapacity()
   + toArray: E[]
   + trimToSize()
   + clone(): DynamicArray<E>
   + isEmpty(): boolean
   + size(): int
   + clear()
   + toString(): String
   + equals(o: Object): boolean
   


Submission:
You are going to submit the following:
1.	The ClassName.txt file, where ClassName is a placeholder for whichever .java file you worked on. As before, copy-paste the code from a .java file to a .txt file with the same name.
2.	A link to a YouTube video where you recorded yourself talking about the project. The video must show your screen/code and your face, and it should not be longer than 5 mins. You must talk about the following points:
a.	A walkthrough of your code, demonstrating strong understanding of what you wrote and the logic you used in your code.
b.	Challenges you faced during the implementation and how you resolved those challenges.
c.	Aspects you could improve or new features you could add in the next version of the game.

Rubric:
Below you will find a general rubric that will be used for your grading. Use this general rubric as guideline for best practices to follow in your code.
Note: this is not the actual rubric. The actual rubric will be posted on Brightspace and it will be used to score your work.

Please make sure you:
1.	Comment (especially the parts that have complex logic) and indent properly. 
Note: comments do not have to be just 1 line, so do not constrain yourself.
2.	Clear logic. Spaghetti code will lose points
3.	Compiles and executes correctly.

