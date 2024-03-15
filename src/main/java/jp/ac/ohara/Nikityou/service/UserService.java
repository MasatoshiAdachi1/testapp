package jp.ac.ohara.Nikityou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.ohara.Nikityou.Repository.UserRepository;
import jp.ac.ohara.Nikityou.model.UserModel;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository repository;

	/**
	 * アドレス帳一覧の取得
	 * @return List<UserModel>
	 */
	public List<UserModel> getUserList() {
	    List<UserModel> entityList = this.repository.findAll();
	    return entityList;
	}

	/**
	 * 詳細データの取得
	 * @param @NonNull Long index
	 * @return  UserModel
	 */
	public UserModel get(@NonNull Long index) {
		UserModel User = this.repository.findById(index).orElse(new UserModel());
		return User;
	}
/*
 * 保存
 * @param UserModel usermodel
 */

	public void save(@NonNull UserModel address) {
        this.repository.save(address);
    }

	/**
	 * アドレス帳データの削除
	 * @param @NonNull Long index
	 */
	public void delete(@NonNull Long index) {
		this.repository.deleteById(index);
	}
}