package TutorialMintic.Seguridad.Repositorios;

import TutorialMintic.Seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository <Usuario,String> {

}
