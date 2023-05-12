public abstract class Car extends Vehicle {
	
	private int numDoors;
	private int numPassengers
	
	public Car(String aMake, String aModel, String aPlate, int doors, int passengers) {
		this.make = aMake;
		this.model = aModel;
		this.plate = aPlate;
		this.numDoors = doors;
		this.numPassengers = passengers;
	}
	
	public int getDoors() {
		return this.numDoors;
	}
	
	public int getNumPassengers() { 
		return this.numPassengers;
	}
	
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.", this.numDoors, this.make, this.model, this.plate);
		return result;
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Vehicle)) {
			return false;
		}
		
		Vehicle otherVec = (Vehicle) other;
		
		if(this.make.equals(otherVec.getMake())) {
			if(this.model.equals(otherVec.getModel())) {
				if(this.plate.equals(otherVec.getPlate())) {
					if(this.numDoors == otherVec.getDoors() {
							if(this.numPassengers == otherVec.getNumPassengers() {
									return true;
				}
			}
		}
	}
}
		
		return false;
	}
	
	public Car copy() {
		return new Car(getMake(), getModel(), getPlate(), getDoors(), getNumPassengers())
	}
	

}