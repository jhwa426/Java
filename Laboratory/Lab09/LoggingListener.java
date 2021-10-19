//Q02
class LoggingListener implements Observer{
	public void update(Observable o, Object arg) {
		System.out.printf("Log:%s\n", arg);
		
	}

}
