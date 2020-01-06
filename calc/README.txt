This document is to explain how the program (i.e. the post-fix calculator) is coded and what are functionalities

1. There is the class PfCalculator which takes in the QUEUE of strings as an input and the evaluate method of PfCalculator class checks if the element
   of the queue are number(operands) or operators. 
   Based on this the method pushes the operands into the stack of strings and whenever the operators are ecountered two elements from the stack are
   popped and converted into double and the operations are performed and the result is converted into strings and pushed back into the stack.

2. The above process continues untill the stack is empty.

3. This program also handles the appropriate exception which can be generated during the execution of the program.

4. The program asks the user each time whether the user wants to continue or not.
   Each time you want to run the program press 'y' or 'Y';
   Otherwise press 'n' or 'N' or any character other than 'y' or 'Y'

5. The program implements following java concepts 
	Colletions
	Generics
	Exception Handling
	Packages
	Static
	With appropriate naming conventions and access modifiers.





															Thank you
