package com.bank.customer_service.service;


import com.bank.customer_service.dto.UserDTO;
import com.bank.customer_service.entity.User;
import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    UserDTO updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
}