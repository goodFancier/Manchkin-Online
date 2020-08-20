package com.manchkinonline.manchkin_online.dto.user;

import javax.persistence.*;

@Entity
public class User
{
		public User()
		{
		}

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		private String nickName;

		private String email;

		@Column(name = "role", columnDefinition = "ENUM('Administrator', 'Player') NOT NULL DEFAULT 'Player'")
		@Enumerated(EnumType.STRING)
		private UserRole role;

		public Long getId()
		{
				return id;
		}

		public void setId(Long id)
		{
				this.id = id;
		}

		public String getNickName()
		{
				return nickName;
		}

		public void setNickName(String nickName)
		{
				this.nickName = nickName;
		}

		public String getEmail()
		{
				return email;
		}

		public void setEmail(String email)
		{
				this.email = email;
		}

		public UserRole getRole()
		{
				return role;
		}

		public void setRole(UserRole role)
		{
				this.role = role;
		}
}
