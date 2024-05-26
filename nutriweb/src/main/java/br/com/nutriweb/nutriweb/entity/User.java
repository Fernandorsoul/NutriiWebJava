package br.com.nutriweb.nutriweb.entity;

import lombok.*;
import java.util.UUID;

import org.thymeleaf.expression.Dates;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
    private UUID userId;
    @NonNull
	private String username;
    @NonNull
    private String email;
    @NonNull
    private String passwordHash;
   
    private boolean isActive;
    @NonNull
    private Dates registrationDate;
}