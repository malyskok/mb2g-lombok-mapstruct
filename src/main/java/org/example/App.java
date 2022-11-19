package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = User.builder().firstname("Jan").lastname("Kowalski").email("jan.kowalski@mail.com").build();
        System.out.printf("Hello %s!", user.getFirstname());
    }
}
