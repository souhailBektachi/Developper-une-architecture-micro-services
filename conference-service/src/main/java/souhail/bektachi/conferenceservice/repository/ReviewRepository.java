package souhail.bektachi.conferenceservice.repository;

import souhail.bektachi.conferenceservice.dto.ReviewDTO;
import souhail.bektachi.conferenceservice.entity.Conference;
import souhail.bektachi.conferenceservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findReviewsByConferenceId(Long conferenceId);

}