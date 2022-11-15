package TutorialMintic.Seguridad.Repositorios;
import TutorialMintic.Seguridad.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}
