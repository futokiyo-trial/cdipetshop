package io.yoshizaki4439.animalimpl;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.inject.Named;


import io.yoshizaki4439.animal.Cat;


@Named("Neko")
@Dependent
public class CatImpl implements Cat, Serializable {

	private static final long serialVersionUID = -6976858607040756541L;

	@Override
	public void makeSound() {
		System.out.println("Nyaaaaa");
	}
	


}
