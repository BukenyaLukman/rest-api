package app.rest.restapiapp.mapper;

import app.rest.restapiapp.dto.UserDto;
import app.rest.restapiapp.entity.User;

import java.util.List;

public class UserMapper {

    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );

        return userDto;
    }

    // convert userDto to User JPA Entity
    public static User mapToUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );

        return user;
    }

    public static List<UserDto> mapToUserDtoList(List<User> users) {
        List<UserDto> userDtos = null;

        for (User user : users) {
            UserDto userDto = new UserDto(
                    user.getId(),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getEmail()
            );

            userDtos.add(userDto);
        }

        return userDtos;
    }
}
