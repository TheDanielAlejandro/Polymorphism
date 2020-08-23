package com.company;


class Movie{

    private String name;


    // CONSTRUCTOR

    public Movie(String name){
        this.name = name;
    }


    // GET METHOD

    public String getName() {
        return name;
    }


    // OTHER METHODS

    public String plot(){
        return "No plot here.";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats a lots of people.";
    }
}


class IndependeceDay extends Movie{

    public IndependeceDay() {
        super("Independece Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{

    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try and scape a maze";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }
    // No plot method
}

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i < 2; i++ ){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot : " + movie.plot() + "\n");
        }


    }


    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random()*4) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependeceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgettable();
        }
        return null;
    }
}
