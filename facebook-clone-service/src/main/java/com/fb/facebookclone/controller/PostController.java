package com.fb.facebookclone.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fb.facebookclone.model.Post;
import com.fb.facebookclone.service.PostService;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/post")
public class PostController {
	
	private PostService postService;
	
	public PostController(PostService postService) {
		this.postService=postService;
	}
	
	@PostMapping
	public Post addPost(@RequestParam Map<String,String> requestParames) throws Exception {
	
		String strPost = requestParames.get("post");
		String email = requestParames.get("email");
		String name = requestParames.get("name");
		String file = requestParames.get("image");
		String profilePic = requestParames.get("profilePic");
		
		Post post = Post.builder()
				.file(file)
				.email(email)
				.profilePic(profilePic)
				.post(strPost)
				.name(name)
				.timestamp(new Date().toString())
				.build();
		
		post = postService.addPost(post);
		
		return post;
	}
	@GetMapping
	public List<Post> getPost(){
		return postService.getPost();
	}
	
	

}
