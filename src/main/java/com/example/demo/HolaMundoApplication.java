package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*es equivalente a usar las anotaciones @Configuration,
 *  @EnableAutoConfiguration y @ComponentScan con sus
 *   configuraciones por defecto.*/

/*  @Configuration: Esta anotación se utiliza para indicar que la clase puede contener beans que serán registrados al iniciar la aplicación.
    @EnableAutoConfiguration: Con esta anotación se le indica a Spring que se encargue de configurar todas las dependencias que tengamos en el proyecto.
    @ComponentScan: Permite que se escaneen todos los @Component que se encuentre dentro del paquete en el que se define, 
    se puede configurar para que busque en los paquetes que queramos.*/


@SpringBootApplication
public class HolaMundoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(HolaMundoApplication.class, args);
	}

}
