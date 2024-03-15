package jp.ac.ohara.Nikityou.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.Nikityou.model.NikkiModel;

@Repository
public interface NikkiRepository extends JpaRepository<NikkiModel, Long> {
	
}
