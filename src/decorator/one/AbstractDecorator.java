package decorator.one;

public abstract class AbstractDecorator implements Component {

	
	private Component component;
	
	public void setComponent(Component component){
		this.component = component;
	}
	
	@Override
	public void doJob() {
		if(component != null){
			component.doJob();
		}
	}

}
