package souhail.bektachi.conferenceservice.repository;

import souhail.bektachi.conferenceservice.entity.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
