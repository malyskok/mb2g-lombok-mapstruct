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
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDto(user);
        System.out.printf("Hello %s (%s)!", userDTO.getName(), userDTO.getEmail());
    }
}
