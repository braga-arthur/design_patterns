package observer;

import cozyConePackage.SingletonCozyCone;

public class WaitListObserver extends Observer {
	public WaitListObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		if(!SingletonCozyCone.getInstance().isFull()){

		}
	}
}