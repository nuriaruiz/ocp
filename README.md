# ocp
Easy example of open close principle. One of the five SOLID principles of object-oriented design.

The GeneradorPrimos inteface has the common functionaliy of the classes, that is, checks if a number is prime,
and GeneradorPrimosOrdenAsc and  GeneradorPrimosOrdenDesc has two differents implementations with different way of 
ordering items.

So that if you should change or add another ordering you only have to change one of the implementations or add another
interface implementation.