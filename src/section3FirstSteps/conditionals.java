package section3FirstSteps;

public class conditionals {
    public static void main(String[] args) {

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("This is not an alien.");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80;
        double topHits = 14;
        if ((topScore > 77) && (topHits > 15)) {
            System.out.println("You got the high score!");
        }

        if ((topScore > 77) || (topHits > 15)) {
            System.out.println("You got either the high score or the highest amounts of hits, or both.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("Don't be a lingesh.");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen.");
        }

        boolean wasCar = isCar ? true : true;
        // was Car is false if is Car is true
        if (wasCar) {
            System.out.println("wasCar is true.");
        }
    }
}

// if (isAlien) = if isAlien is true
// if (!isAlien) = if isAlien is false
// always utilize {} in if else statements
// (x != 100) means if x is not equal to 100, ! is not operator, tests for false
// && = logical and
// || = logical or
// || and && and boolean operators
// == is boolean operator that means equals, returns boolean
// = assigns values to variables, returns value of variable
// if (isCar = true) {} actually assigns true to isCar
// ternary operators takes three operands, a variable, a condition, and an assignment for another variable that executes only if the operand variable met the condition
// boolean isCar = wasCar ? true : false;
// boolean isEighteenOrOver = (ageOfClient == 20) ? true : true;
// if ageOfClient equals 20, isEighteenOrOver is true