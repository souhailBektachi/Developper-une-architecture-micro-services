package souhail.bektachi.keynoteservice.repository;

import souhail.bektachi.keynoteservice.entity.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface KeynoteRepository extends JpaRepository<Keynote, Long> {
}
