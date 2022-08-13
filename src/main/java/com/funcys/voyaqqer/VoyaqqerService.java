package com.funcys.voyaqqer;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoyaqqerService {

	@Autowired
	private VoyaqqerRepository repository;

	/* ボヤッカラーを1人取得する */

	public Voyaqqerer getVoyaqqerer(String id) {
		//検索
		Map<String,Object>map = repository.findById(id);

		//Mapから値を取得
		String voyaqqererId = (String)map.get("id");
		String voyaqqererName = (String)map.get("name");
		String voyaqqererProfile = (String)map.get("profile");
		int voyaqqererAge = (Integer)map.get("age");

		//Voyaqqererクラスに値をセット
		Voyaqqerer voyaqqerer = new Voyaqqerer();

		voyaqqerer.setVoyaqqererId(voyaqqererId);
		voyaqqerer.setVoyaqqererName(voyaqqererName);
		voyaqqerer.setVoyaqqererProfile(voyaqqererProfile);
		voyaqqerer.setVoyaqqererAge(voyaqqererAge);

		return voyaqqerer;
	}


}
