package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;


@Data
@Entity
@Table(name="system_users")
public class SystemUsers  extends User{
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;

	public SystemUsers() {
		super();
	}

	public SystemUsers(int userId, String firstName) {
		super();
		this.userId = userId;
		this.setId(userId);
		this.firstName = firstName;
	}
	
	
	
}
