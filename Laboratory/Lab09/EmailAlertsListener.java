//Q03
class EmailAlertsListener implements Observer{
	public void update(Observable o, Object arg) {
		System.out.printf("EmailAlert:%s\n", arg);
	}

}
