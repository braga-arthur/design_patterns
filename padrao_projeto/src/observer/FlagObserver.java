package observer;

import javax.swing.*;

public class FlagObserver extends Observer {

	public static final String VACANCIES = "TEMOS VAGAS";
	public static final String NO_VACANCIES = "NÃO TEMOS VAGAS";
	JFrame flagFrame = new JFrame();
	JLabel label = new JLabel();

	public FlagObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
		flagFrame.setSize(200, 100);
		flagFrame.setVisible(true);
		label.setText(VACANCIES);
		flagFrame.add(label);
	}

	@Override
	public void update() {
		if(subject.getState()){
			label.setText(NO_VACANCIES);
			return;
		}

		label.setText(VACANCIES);
	}
}