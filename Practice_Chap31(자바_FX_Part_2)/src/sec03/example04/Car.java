package sec03.example04;

import javafx.beans.property.SimpleStringProperty;

public class Car {
	
	// String Ÿ���� �Ӽ��� ��Ʈ�� �ϱ� ���ؼ� SimpleStringProperty��ü�� �����.
	
	private SimpleStringProperty carName;
	private SimpleStringProperty carMoney;
	private SimpleStringProperty carImage;
	
	public Car(String carName, String carMoney, String carImage) {
		 
		this.carName  = new SimpleStringProperty(carName);
		this.carMoney = new SimpleStringProperty(carMoney);
		this.carImage = new SimpleStringProperty(carImage);
	}

	
	
	public String getCarName() {
		return carName.get();
	}

	public void setCarName(String carName) {
		this.carName.set(carName);
	}

	public String getCarMoney() {
		return carMoney.get();
	}

	public void setCarMoney(String carMoney) {
		this.carMoney.set(carMoney);
	}

	public String getCarImage() {
		return carImage.get();
	}

	public void SetCarImage(String carImage) {
		this.carImage.set(carImage);
	}
	
	
	
	
	
}
