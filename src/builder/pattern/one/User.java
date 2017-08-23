package builder.pattern.one;

public class User {

	private long id;
	private String name;
	private String surname;
	private String username;
	private String email;
	private char password;

	public User() {
	}
	
	public User(UserBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.surname = builder.surname;
		this.username = builder.username;
		this.email = builder.email;
		this.password = builder.password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getPassword() {
		return password;
	}

	public void setPassword(char password) {
		this.password = password;
	}

	public static class UserBuilder {

		private long id;
		private String name;
		private String surname;
		private String username;
		private String email;
		private char password;

		public UserBuilder id(long id) {
			this.id = id;
			return this;
		}

		public UserBuilder name(String name) {
			this.name = name;
			return this;
		}

		public UserBuilder surname(String surname) {
			this.surname = surname;
			return this;
		}

		public UserBuilder username(String username) {
			this.username = username;
			return this;
		}
		
		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public UserBuilder password(char password) {
			this.password = password;
			return this;
		}
		
		public User build(){
			return new User(this);
		}

	}

}
