package TutorialMintic.Seguridad.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document()

public class Usuario {
    @Id
    private String _id;
    private String Seudonimo;
    private String correo;
    private String contrasena;

    @DBRef
    private Rol rol;

    public Usuario(String Seudonimo, String correo, String contrasena) {
        this.Seudonimo = Seudonimo;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String get_id() {

        return _id; }


    public String getSeudonimo() {return Seudonimo;}

    public void setSeudonimo(String Seudonimo) {
        this.Seudonimo = Seudonimo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
