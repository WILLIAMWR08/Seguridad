package TutorialMintic.Seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import TutorialMintic.Seguridad.Modelos.PermisosRoles;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}
