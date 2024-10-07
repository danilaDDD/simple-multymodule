package ru.gb.danila.main;


import ru.gb.danila.users.domain.User;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        User user = new User("nikitin", "danila", "anatoly");
        System.out.printf( "Hello World from %s%n", user);
    }
}
