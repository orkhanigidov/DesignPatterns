package mediator.pattern;

public class MediatorTest {
	public static void main(String[] args) {
		
		ConcreteMediator mediator = new ConcreteMediator();
		
		Friend1 Sanani = new Friend1(mediator, "Sanani");
		Friend2 Orxan = new Friend2(mediator, "Orxan");
		Boss boss = new Boss(mediator, "Nobody");
		
		mediator.setFriend1(Sanani);
		mediator.setFriend2(Orxan);
		mediator.setBoss(boss);
		
		Sanani.send("Hi");
		Orxan.send("Hello");
		boss.send("How are you friends?");
		
	}
}
