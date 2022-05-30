package com.fb.facebookclone.service;

import java.util.List;

import com.fb.facebookclone.model.Post;

public interface PostService {

	Post addPost(Post post) throws Exception;

	List<Post> getPost();

}
