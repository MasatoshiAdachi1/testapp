package jp.ac.ohara.Nikityou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.ohara.Nikityou.Repository.NikkiRepository;
import jp.ac.ohara.Nikityou.model.NikkiModel;

@Service
@Transactional
public class NikkiService {

    @Autowired
    private NikkiRepository repository;

    /**
     * 日記一覧を取得するメソッド
     * @return 日記データのリスト（List<NikkiModel>）
     */
    public List<NikkiModel> getNikkiList() {
        List<NikkiModel> entityList = this.repository.findAll();
        return entityList;
    }

    /**
     * 指定されたIDに対応する日記データを取得するメソッド
     * @param index 取得したい日記データのID
     * @return 指定されたIDに対応する日記データ（NikkiModel）
     */
    public NikkiModel get(@NonNull Long index) {
        NikkiModel nikki = this.repository.findById(index).orElse(new NikkiModel());
        return nikki;
    }

    /**
     * 新しい日記データを保存するメソッド
     * @param nikkimodel 保存する日記データ（NikkiModel）
     */
    public void save(@NonNull NikkiModel nikkimodel) {
        this.repository.save(nikkimodel);
    }

    /**
     * 指定されたIDに対応する日記データを削除するメソッド
     * @param nikkiid 削除したい日記データのID
     */
    public void delete(@NonNull Long nikkiid) {
        this.repository.deleteById(nikkiid);
    }
}
