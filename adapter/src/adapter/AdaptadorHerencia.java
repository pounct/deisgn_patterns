package adapter;

//adaptador per herència
public class AdaptadorHerencia extends Adaptat implements IEstandard {

	@Override
	public void metodeEstandard(int i, int j) {

		int num = metodeAltr(i, j);

		metodeAdaptat(num);

	}

}
