package com.camera;

public class camera {
	private String resolution;
	private double megapixel;
	private String memoryCapacity;
	private String lens;
	private String brand;
	private String model;

	public camera(String resolution, double megapixel, String memoryCapacity, String lens, String brand, String model) {
		this.resolution = resolution;
		this.megapixel = megapixel;
		this.memoryCapacity = memoryCapacity;
		this.lens = lens;
		this.brand = brand;
		this.model = model;
	}
	public String getResolution() {
		return this.resolution;
	}
	public double getMegapixel() {
		return this.megapixel;
	}
	public String getMemorycapacity() {
		return this.memoryCapacity;
	}
	public String getLens() {
		return this.lens;
	}
	public String getBrand() {
		return  this.brand;
	}
	public String getModel() {
		return this.model;
	}

	public void flash(String typeFlash) {
		System.out.println("The flash is" + typeFlash);
	}
	public void zoom(double zoom) {
		System.out.println("Zoom " + zoom);
	}
	public void timer(int timeSeconds) {
		System.out.println("Timer is set to " + timeSeconds +"seconds");
	}
	public void effects(String pictureEffect) {
		System.out.println("Put " + pictureEffect + " to the picture");
	}
	
}
