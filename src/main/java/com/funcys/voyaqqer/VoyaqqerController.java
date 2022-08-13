package com.funcys.voyaqqer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VoyaqqerController {

	@Autowired
	private VoyaqqerService service;

	@GetMapping("/voyaqqer")
	public String getVoyaqqer() {
		//voyaqqer.htmlに画面遷移
		return "voyaqqer";
	}

	@PostMapping("/nyuryoku")
	public String PostRequest(@RequestParam("nyuryokuchi") String strNyuryokuchi, Model model) {

		//画面から受け取った文字列をModelに登録
		model.addAttribute("formNyuryokuchi",strNyuryokuchi);

		//response.htmlに画面遷移
		return "voyaqqer/response";

	}

	@PostMapping("/voyaqqer/db")
	public String postDbRequest(@RequestParam("voyaqqererId") String id,Model model) {

		//1件
		Voyaqqerer voyaqqerer = service.getVoyaqqerer(id);

		//検索結果をModelに登録
		model.addAttribute("voyaqqerer",voyaqqerer);

		//db.htmlに画面遷移
		return "voyaqqer/db";
	}

}
