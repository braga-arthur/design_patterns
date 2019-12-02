package observerPackage;

import cozyConePackage.SingletonCozyCone;

public class WaitListObserver extends Observer {
	public WaitListObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		if(!subject.getState()){
			SingletonCozyCone.getInstance().getWaitList().forEach(w -> System.out.println("O usuário " + w.getUser().getName() + " foi avisado que há vagas."));
		}
	}
}