package com.pk.user.service.services;

import com.pk.user.service.entities.User;
import java.util.List;

public interface UserService {
     User saveUser(User user);
     List <User> getAllUser();

     User getUser(String userId);

}
