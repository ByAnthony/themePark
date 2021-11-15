# Theme Park - Homework Revising Abstract Classes, Interfaces and Polymorphism.

### Learning Objectives

Practice modelling a large real world domain and what you have learned about using:

* classes
* inheritance
* abstract classes
* interfaces

## ThemePark

### MVP

#### Classes and Abstract Classes

Look through the start code and understand what is set up for you already.

 - `Visitor` class with age, height and money.
 - `Attraction` abstract class with name, rating and visitCount (which starts at 0).
 - `Rollercoaster`, `Dodgems`, `Park` and `Playground` classes which inherit from `Attraction`
 - `Stall` abstract class which has name, owner name, rating and parking spot.
 - `CandyFlossStall`. `TobaccoStall` and `IceCreamStall` which inherit from `Stall`.

All of these classes have tests set up for them.

#### Interfaces

Introduce some Interfaces to enable charging, restricting and reviewing attractions and stalls:

1. `ITicketed` promises `double defaultPrice()` and `double priceFor(Visitor)`
2. `ISecurity` promises `boolean isAllowedTo(Visitor)`
3. `IReviewed` promises `int getRating()` and `String getName()`

	Have some of the classes implement these interfaces. Below are the rules about what the implementations should be:

4. `Playground` implements `ISecurity` because it has a maximum age of 15
5. `TobaccoStall` implements `ISecurity` because it has a minimum age of 18
6. `Rollercoster` implements `ISecurity` and requires a visitor to be over 145cm tall and over 12 years of age
7. All Stalls and Attractions implement `IReviewed`.

###### Note: Starting prices are:
 - £8.40 for `Rollercoaster`
 - £4.50 for `Dodgems`

8. `Rollercoaster` implements `ITicketed` and charges tall people over 200cm double fee
9. `Dodgems` implements `ITicketed` and charge half price to children under 12 years old

### Extensions

Create a `ThemePark` class to manage the attractions and stalls.

1. `ThemePark` stores all `Attractions` and `Stalls` in it.
2. `ThemePark` has a method `getAllReviewed()` which returns an ArrayList of `IReviewed` objects.
3. Add an empty `visitedAttractions` ArrayList to `Visitor` which stores a list of `Attractions` and a method to add an attraction to the list.
