package com.demo.springjwt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.demo.springjwt.models.ERole;
import com.demo.springjwt.models.Role;
import com.demo.springjwt.models.User;
import com.demo.springjwt.repository.RoleRepository;
import com.demo.springjwt.repository.UserRepository;

import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}



/*
	@ConditionalOnProperty(name="mock.usuarios")
	@Bean
	public CommandLineRunner commandAddUser(RoleRepository roleRepository) {
				return args -> {
					roleRepository.saveAndFlush( new Role(ERole.ROLE_ADMIN));
					roleRepository.saveAndFlush( new Role(ERole.ROLE_MODERATOR));

		};
	}
*/
	@ConditionalOnProperty(name="mock.usuarios")
	@Bean
	public CommandLineRunner commandAddUser(UserRepository userRepository, RoleRepository roleRepository) {
				return args -> {
					
			        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
					User s =new User("usuario", "admin@admin.com",passwordEncoder.encode("123456"));
					Role role = roleRepository.saveAndFlush(new Role(ERole.ROLE_ADMIN));
					
					Set<Role> set =  Stream.of(role).collect(Collectors.toSet());
					s.setRoles(set);
					userRepository.saveAndFlush(s);

		};
	}
	
}
