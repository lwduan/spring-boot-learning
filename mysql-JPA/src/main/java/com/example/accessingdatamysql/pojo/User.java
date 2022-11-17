package com.example.accessingdatamysql.pojo; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table; 
import lombok.Data; 

@Data

@Entity
//创建实例

@Table(name="s_user")

public class User 
{ 
  @Id
  @GeneratedValue 
  
  private Integer id; 

  @Column(length=20) private String userName; 
  @Column(length=1) private String type; 

}