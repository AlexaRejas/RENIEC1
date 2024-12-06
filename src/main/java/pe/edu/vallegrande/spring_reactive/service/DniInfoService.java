import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DniInfoService {

    @Autowired
    private DniInfoRepository dniInfoRepository;

    private final OkHttpClient client = new OkHttpClient();

    public DniInfo obtenerDatosPorDni(String dni) throws IOException {
        Request request = new Request.Builder()
                .url("https://dniruc.apisperu.com/api/v1/dni/" + dni + "?token=tu_token")
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                // Procesar la respuesta y mapearla a la entidad DniInfo
                // Aquí debes deserializar la respuesta JSON a un objeto DniInfo
                // Por simplicidad, se omite la deserialización
            } else {
                // Manejo de errores
            }
        }
        return null; // Cambiar esto por el objeto DniInfo mapeado
    }
}
