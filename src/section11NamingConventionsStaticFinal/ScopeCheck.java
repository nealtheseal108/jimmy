package section11NamingConventionsStaticFinal;

public class ScopeCheck {
    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", var1 = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo() {
        int var2 = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " times two is " + i * var2);
        }
    }

    public class InnerClass {
        public int var3;

        public InnerClass() {
            System.out.println("InnerClass was created, var3 is " + var3);
        }

        public void timesTwo() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " times two is " + i * var3);
            }
        }
    }
}

// scope refers to the visibility of a member, class or variable
// the 'privateVar' variable in the 'timesTwo()' method is local to that method
// when Java sees a variable, it checks where the variable is declared (in which code block)
// the variable is local to that code block
// when a for loop terminates, its iterator (if defined in the for loop) goes out of scope
// if Java sees two variables of the same name and datatype and there is a function that utilizes one, it uses the one defined in the most local scope
// if you want to use a variable declared as part of the class in a method/code block that declares a field of the same name and datatype, use 'this.'