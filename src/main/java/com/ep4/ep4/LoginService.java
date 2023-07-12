package com.ep4.ep4;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class LoginService {

    @Autowired
    private  LoginRepository loginRepository;


    public boolean validateLogin(String nombre, String pasword){
        login login = loginRepository.findByNombreAndPasword(nombre, pasword);
        return login != null;
    }
    public List<login> mostrartodo(){
        return loginRepository.findAll();
    }

}
