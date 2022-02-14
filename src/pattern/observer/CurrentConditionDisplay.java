package pattern.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherDate;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherDate = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("현재 온도와 습도 : " + temperature + humidity);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
