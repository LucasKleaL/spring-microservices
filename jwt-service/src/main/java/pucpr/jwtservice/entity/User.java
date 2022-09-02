package pucpr.jwtservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class User {

    private String username;
    private String password;
    private String fisrtName;
    private String lastName;
    private String email;

}
