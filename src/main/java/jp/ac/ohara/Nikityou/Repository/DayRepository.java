package jp.ac.ohara.Nikityou.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.Nikityou.model.DayModel;

@Repository
public interface DayRepository extends JpaRepository<DayModel, Long> {
	
}
