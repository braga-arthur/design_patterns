package observer;

import cozyConePackage.SingletonCozyCone;

public class FlagObserver extends Observer {
	public FlagObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		if(SingletonCozyCone.getInstance().isFull()){
			//desligar sinalizador
			return;
		}

		//ligar sinalizador
	}
}