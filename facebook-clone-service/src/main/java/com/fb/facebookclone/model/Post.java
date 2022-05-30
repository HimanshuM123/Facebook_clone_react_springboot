package com.fb.facebookclone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

	private String id;
	private String post;
	private String name;
	private String email;
	private String image;
	private String profilePic;
	private String timestamp;
	private String file;
}
