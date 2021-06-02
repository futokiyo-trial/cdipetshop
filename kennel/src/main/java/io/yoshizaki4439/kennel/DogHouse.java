package io.yoshizaki4439.kennel;

import io.yoshizaki4439.animal.Dog;
import io.yoshizaki4439.animal.Cat;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

@Named("DogHouse")
@Dependent
public class DogHouse implements Serializable {
	
	private static final long serialVersionUID = 2179787307454475471L;
	
	@Inject
	private Dog dog;

	
	public void makeSounds(){
		dog.makeSound();

	}
	
}