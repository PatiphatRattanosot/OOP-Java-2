package com.npru.se65;

public class HumanBeing {
	private double weight;
	private double height;
	private double bmi;
	
	private double getHeight() {
		return height;
	}
	private double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBmi() {
		return bmi;
	}
	private void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public void calculateBMI() {
		BmiIndexer bmi1 = new BmiIndexer();
		setBmi(bmi1.calculateBMI(getHeight(),getWeight()));
	}
	public String analyzeBmi() {
		HealthAnalyzer ha = new HealthAnalyzer();
		return ha.analyzerBmi(getBmi());
	}
	
}
