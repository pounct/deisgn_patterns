package adapter;

public class AdaptadorComposicio implements IEstandard {

	private Adaptat adaptat = new Adaptat();

	@Override
	public void metodeEstandard(int i, int j) {

		int num = adaptat.metodeAltr(i, j);

		adaptat.metodeAdaptat(num);

	}

}
