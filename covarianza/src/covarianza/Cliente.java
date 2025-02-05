package covarianza;

public class Cliente {
	protected Number myMethod() {
		return null;
	}
	public long miMetodo() {
		return 0l;
	}
}

class ClienteVip extends Cliente{
	@Override
	public Integer myMethod() {
		return null;
	}
	@Override
	public long miMetodo() {
		return 0;
	}
	
}

