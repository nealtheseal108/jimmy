package section7OOP2;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return this.name;
    }
}

class Jaws extends Movie {
    public Jaws () {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay () {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over Earth.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe.";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable");
    }
}

class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "; plot: " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number from 1 to 5 was " + randomNumber + ".");
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }
        return null;
    }
}

// polymorphism is the mechanism in OOP that allows actions to act differently based on the object that the action is being performed on
// different subclass methods act differently based on the qualities of the subclass
// assigning different functionalities/values to methods/classes/fields based on another quality

