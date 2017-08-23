package builder.pattern.one;

public class BuilderTest {
	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder()
				.id(7)
				.name("Sanani")
				.surname("Racabov")
				.username("sananiracabov")
				.build();
		
		User user2 = new User.UserBuilder()
				.id(8)
				.name("Sarxan")
				.surname("Racabov")
				.username("sarxanracabov")
				.email("*******@gmail.com")
				.password('p')
				.build();
		
		System.out.println("User1 username: " + user1.getUsername());
		System.out.println("User2 username: " + user2.getUsername());
		System.out.println("User2 email: " + user2.getEmail());
		
	}
}
