package programator.katowice.cave;

class Wawelsky extends PolishDragon {

	@Override
	public void hello() {
		System.out.println("I am Wawelsky!");
	}

	@Override
	public void whereAreYou() {
		System.out.println("Jestem na polu");
	}

	@Override
	protected void howFullYouAre() {
		System.out.println("Po litrze");
	}
}
