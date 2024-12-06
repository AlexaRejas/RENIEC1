import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dni")
public class DniInfoController {

    @Autowired
    private DniInfoService dniInfoService;

    @GetMapping("/{dni}")
    public DniInfo obtenerDatosPorDni(@PathVariable String dni) {
        try {
            return dniInfoService.obtenerDatosPorDni(dni);
        } catch (IOException e) {
            // Manejo de excepciones
            return null; // Manejar adecuadamente
        }
    }
}
