package com.test;
import com.camera.*;
public class test {

	public static void main(String[] args) {
		camera t1 = new camera("1080p", 24.2, "32 gb", "Standard Lens", "Nikon", "D5600");
		/*.resolution = "1080p";
		t1.megapixel = 24.2;
		t1.memoryCapacity = "32 gb";
		t1.lens = "standard lens";
		t1.brand = "Nikon";
		t1.model = "D5600";
		
		/* System.out.println("Brand: " + t1.brand);
		System.out.println("Model: " + t1.model);
		System.out.println("Megapixels: " + t1.megapixel);
		System.out.println("Resolution: " + t1.resolution);
		System.out.println("Memory Capacity: " + t1.memoryCapacity);
		System.out.println("Lens: " + t1.lens); */

		System.out.println("Brand: " + t1.getResolution());
		System.out.println("Model: " + t1.getModel());
		System.out.println("Megapixel :" + t1.getMegapixel());
		System.out.println("Resolution" + t1.getResolution());
		System.out.println("Memory Capacity: " + t1.getMemorycapacity());
		System.out.println("Lens: " + t1.getLens());
		

	}

}
