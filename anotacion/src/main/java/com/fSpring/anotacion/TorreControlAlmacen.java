package com.fSpring.anotacion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TorreControlAlmacen {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		GestionAlmacen gestor = (GestionAlmacen) context.getBean("gestionAlmacen");
		System.out.println(gestor.listarTodosProductos1().get(0).getNombre());
		System.out.println(gestor.listarTodosProductos2().get(0).getNombre());
	}

}
