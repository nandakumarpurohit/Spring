package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * @author vincent
 *
 */
@Entity
@Table(name = "USER_TBL")
public class User {

   @Id
   @GeneratedValue
   @Column(name = "UID")
   private Long id;

   @Column(name = "NAME")
   @Size(max = 20, min = 3, message = "{user.name.invalid}")
   private String name;

   @Column(name = "EMAIL", unique = true)
   @Email(message = "{user.email.invalid}")
   private String email;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

}
