package br.com.guifroes.ecom.entity;

import br.com.guifroes.ecom.enums.UsuarioRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	
	private String password;
	
	private String nome;
	
	private UsuarioRole role;
	
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] img;
	
}
