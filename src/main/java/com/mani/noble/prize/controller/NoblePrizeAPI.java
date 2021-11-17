package com.mani.noble.prize.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mani.noble.prize.api.pojo.NobelPrize;
import com.mani.noble.prize.api.pojo.NoblePrizes;

@RestController
@RequestMapping("/prizes")
public class NoblePrizeAPI {

	@Autowired
	RestTemplate template;

	@GetMapping("/{cat}")
	public NoblePrizes name(@PathVariable("cat") String category, @PathParam("from") Integer from,
			@PathParam("to") Integer to) {

		Assert.notNull(from," from cant be null");
		// offset="+from+"&limit="+(to-from)+"&
		ResponseEntity<NoblePrizes> prizes = template.getForEntity(
				"http://api.nobelprize.org/2.1/nobelPrizes?sort=asc&nobelPrizeCategory=" + category, NoblePrizes.class);
		List<NobelPrize> li = prizes.getBody().getNobelPrizes().stream().skip(from).limit(to - from)
				.sorted((x, y) -> (x.getPrizeAmount() - y.getPrizeAmount())).collect(Collectors.toList());
		prizes.getBody().setNobelPrizes(li);
		return prizes.getBody();
	}

}
