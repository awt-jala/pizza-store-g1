package main.java.p1;

public abstract class Lasagna {

	private final LasagnaType lasagnaType;

	Lasagna(LasagnaType lasagnaType) {
		this.lasagnaType = lasagnaType;
	}

	abstract void prepare();

	abstract void bake();

	abstract void deliver();
}
