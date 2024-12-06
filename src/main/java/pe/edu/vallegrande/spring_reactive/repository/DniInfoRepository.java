import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DniInfoRepository extends ReactiveCrudRepository<DniInfo, Long> {
    // Métodos personalizados si es necesario
}
