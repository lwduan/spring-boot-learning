package com.example.accessingdatamysql.controller; 

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import com.example.accessingdatamysql.dao.UserDao;
import com.example.accessingdatamysql.pojo.User; 

@RestController

@RequestMapping
//支持 Get 和 Post 请求


public class UserController { 
    @Autowired private UserDao userDao; //自动赋值
    
    /** * 新增用户 */ 
    @RequestMapping(value="/addUser") 
    public String addUser(User user) { 
        userDao.save(user); return "ok"; 
    } 
    
    /** * 查询所有用户列表 */ 
    @RequestMapping(value="/userList") 
    public List<User> userList() { 
        return userDao.findAll(); 
    } 
   
    /** * 修改用户 */ 
    @RequestMapping(value="/updateUser") 
    public String updateUser(User user) { 
        userDao.save(user); return "ok"; 
    } 
    /** * 删除用户 */
    @RequestMapping(value="/deleteUser") 
    public String deleteUser(Integer id) { 
        userDao.deleteById(id); 
        return "ok"; 
    }
}
