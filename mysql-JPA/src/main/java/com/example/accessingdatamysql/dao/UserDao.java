package com.example.accessingdatamysql.dao; 
import org.springframework.data.jpa.repository.JpaRepository; 
import com.example.accessingdatamysql.pojo.User;

public interface UserDao 
extends JpaRepository <User, Integer>
{ 

}