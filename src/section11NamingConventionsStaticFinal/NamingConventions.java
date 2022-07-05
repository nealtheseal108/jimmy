package section11NamingConventionsStaticFinal;

public class NamingConventions {
    public static void main(String[] args) {
        org.w3c.dom.Node node = null;
    }
}

// adopting naming conventions in Java makes it easier for others and yourself to understand
// packages: always lowercase, unique, use your internet domain name reversed ('com.nealtheseal108')
// replace invalid characters (ex: '-') in the domain name with an underscore; domain name components starting with a number should instead start with an underscore
// domain name components that are Java keywords should have that component start with an underscore
// class and interface names should use PascalCase, should be intuitive
// method names should be camelCase, verbs that reflect their function
// constants should be all uppercase, words should be separated by underscores
// field names should be camelCase, meaningful and indicative, should not utilize underscores
// type parameters should be single capital letters, E - element, T - type, K - key, V - value

// class/interface names are inevitable, mechanism was needed to fully specify classes to allow use of them with the same name in the same project (or even the same class)
// for this reason packages were created to group related classes and interfaces
// provides a way to protect the namespace, and provides protection beyond regular access modifiers
// one cannot have two import statements of the same class name
// you can use different pointers pointing to different packages to access two classes of the same name in another class
// reasons to use packages: to determine which classes/interfaces are related
// it is easy to find certain classes/interfaces based on the package name
// a package provides a new namespace for classes/interfaces
// classes/interfaces within a package have unrestricted access to one another while still restricting access for classes outside the package
// 'java.uti' and 'java.lang' are both packages
// some packages (like 'java.lang') are automatically imported

// you can create your own packages to import classes to import different functionalities into Java using the external library module

