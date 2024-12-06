import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("dni_info")
public class DniInfo {
    @Id
    private Long id;

    private Boolean success;
    private String dni;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String codVerifica;

    // Getters y Setters
}
