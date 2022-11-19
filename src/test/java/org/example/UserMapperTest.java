package org.example;

import junit.framework.TestCase;

public class UserMapperTest extends TestCase {

    public void testUserToUserDto() {
        //given
        User user = User.builder().firstname("Jan").lastname("Kowalski").email("jan.kowalski@mail.com").build();

        //when
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDto(user);

        //then
        assertNotNull(userDTO);
        assertEquals(user.getFirstname(), userDTO.getName());
        assertEquals(user.getEmail(), userDTO.getEmail());
    }
}