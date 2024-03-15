package jp.ac.ohara.Nikityou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.ohara.Nikityou.Repository.DayRepository;
import jp.ac.ohara.Nikityou.model.DayModel;


@Service
@Transactional
public class DayService {

	@Autowired
	private DayRepository repository;

	/**
	 * アドレス帳一覧の取得
	 * @return List<UserModel>
	 */
	public List<DayModel> getUserList() {
	    List<DayModel> entityList = this.repository.findAll();
	    return entityList;
	}

	/**
	 * 詳細データの取得
	 * @param @NonNull Long index
	 * @return  UserModel
	 */
	public DayModel get(@NonNull Long index) {
		DayModel User = this.repository.findById(index).orElse(new DayModel());
		return User;
	}
/*
 * 保存
 * @param UserModel usermodel
 */

	public void save(@NonNull DayModel daymodel) {
        this.repository.save(daymodel);
    }

	/**
	 * アドレス帳データの削除
	 * @param @NonNull Long index
	 */
	public void delete(@NonNull Long index) {
		this.repository.deleteById(index);
	}
}