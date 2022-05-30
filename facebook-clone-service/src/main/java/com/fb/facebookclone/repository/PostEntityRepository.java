package com.fb.facebookclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fb.facebookclone.entity.PostEntity;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String>{

}
