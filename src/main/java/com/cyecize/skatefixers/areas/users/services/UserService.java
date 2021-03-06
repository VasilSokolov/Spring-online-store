package com.cyecize.skatefixers.areas.users.services;


import com.cyecize.skatefixers.areas.users.bindingModels.UserRegisterBindingModel;
import com.cyecize.skatefixers.areas.users.entities.User;
import com.cyecize.skatefixers.areas.users.enums.UserRoleType;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface UserService extends UserDetailsService {
    void createUser(UserRegisterBindingModel bindingModel, BindingResult bindingResult);

    void disableUser(User user);

    void enableUser(User user);

    void changeUserRole(User user, UserRoleType roleType);

    void changePassword(String password, User user);

    User findOneById(Long id);

    User findOneByUsername(String username);

    User findOneByEmail(String email);

    List<User> findAll();

    List<User> findByRole(UserRoleType roleType);


}
