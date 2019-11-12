package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;


/*@RunWith(SpringRunner.class) para que el tets use el runner de Spring y
 * @SpringBootTest que lo que hace es buscar la clase anotada con @SpringBootApplication 
 * y usarla para cargar el contexto completo de la aplicación para hacer el test 
 * normalmente no vamos a necesitar cargar toda la aplicación a no ser que queramos hacer
 *  una prueba completa de todas las capas de muestra aplicación.*/

@SpringBootTest
class HolaMundoApplicationTests {

	@Test
	void contextLoads() {
	}

}
