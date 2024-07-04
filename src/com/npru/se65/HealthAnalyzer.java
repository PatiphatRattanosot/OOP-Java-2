package com.npru.se65;

public class HealthAnalyzer {
	public String analyzerBmi(double bmi) {
		if (bmi <= 18.5) {
			return "Underweight";
		}else if(bmi <= 24.9){
			return "Normal weight";
		}else if(bmi<=39.9){
			return "Overweight";
		}else {
			return "Obesity";
		}
	}
}
