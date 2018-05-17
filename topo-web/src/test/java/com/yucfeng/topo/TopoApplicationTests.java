package com.yucfeng.topo;

import com.yucfeng.topo.model.EData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopoApplicationTests {

//	@Test
//	public void contextLoads() {
//	}

	@Autowired
	private RedisTemplate<String, EData> redisTemplate;

	@Test
	public void test() throws Exception {

		// 保存对象
		EData link = new EData("A", "B", 12);

		redisTemplate.opsForValue().set("topo", link);

//		link = new EData("A", "F", 16);
//		redisTemplate.opsForValue().set(2, link);
//
//		link = new EData("A", "G", 14);
//		redisTemplate.opsForValue().set(3, link);


//		Assert.assertEquals(12, redisTemplate.opsForValue().get(1).getWeight());
//		Assert.assertEquals(16, redisTemplate.opsForValue().get(2).getWeight());
//		Assert.assertEquals(14, redisTemplate.opsForValue().get(3).getWeight());

	}
}
