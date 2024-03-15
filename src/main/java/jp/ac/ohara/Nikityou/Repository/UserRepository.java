package jp.ac.ohara.Nikityou.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.Nikityou.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
	
	
}
