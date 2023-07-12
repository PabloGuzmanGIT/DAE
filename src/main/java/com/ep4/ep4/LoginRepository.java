package com.ep4.ep4;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository  extends JpaRepository<login, Integer> {
    login findByNombreAndPasword(String nombre, String pasword);
}
