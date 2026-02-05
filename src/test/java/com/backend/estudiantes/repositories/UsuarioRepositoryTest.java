package com.backend.estudiantes.repositories;

import com.backend.estudiantes.model.Role;
import com.backend.estudiantes.model.Usuario;
import com.backend.estudiantes.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class UsuarioRepositoryTest {

    @Autowired
    private UsuarioRepository repository;//inyeccion de dependencias para poder usar y hacer los tests


    @Test //test para comprobar que el email sea valido en la database
    //Convenccion para los test: nombreDeMetodo_condicion_resultadoEsperado
    void findByEmail_UsuarioExistente_RetornaUsuario(){

        //Instanciamos un objeto usuario
        Usuario testUsuario = new Usuario(
                null,
                "Juan",
                "Barrot",
                "Libertad 123",
                "juan_barrot@gmail.com",
                "123",
                true,
                Role.ESTUDIANTE
        );

        //Pasamos el objeto usuario al método save para guardar en el repositorio
        Usuario guardado = repository.save(testUsuario);

        //Paso el email del usuario al método findByEmail para buscarlo y devuelvo un optional
        Optional<Usuario> encontradoOptional = repository.findByEmail(guardado.getEmail());

        // valido por si falla
        assertTrue(encontradoOptional.isPresent(),"El usuario deberia existir en la base de datos");

        //Obtenemos el usuario
        Usuario encontrado = encontradoOptional.get();

        //comparando los emails, para saber si conciden
        assertEquals("juan_barrot@gmail.com", encontrado.getEmail(),
                "El email del usuario no coincide");

//        assertThat("El nombre buscando no existe",encontrado.getNombre().equals("Juan"));
    }
}
