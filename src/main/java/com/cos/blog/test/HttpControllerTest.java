package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청하면 HTM파일을 응답 : @Controller

//사용자가 요청하면, Data를 응답해주는..
@RestController
public class HttpControllerTest {
	
	//http://localhost:8080/http/get
	
	//인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다.
	//@RequestParam int id, @RequestParam String username :파라미터
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청:"+m.getId() + m.getUsername();
	}
	@PostMapping("/http/post")
	public String postTest(@RequestBody String text) {
		return "post 요청";
	}
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
