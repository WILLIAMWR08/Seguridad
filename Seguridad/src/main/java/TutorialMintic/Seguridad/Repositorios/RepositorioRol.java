package TutorialMintic.Seguridad.Repositorios;

import TutorialMintic.Seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends MongoRepository <Rol,String> {

}

