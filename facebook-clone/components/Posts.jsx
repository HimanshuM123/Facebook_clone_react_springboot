import { useEffect } from "react";
import Post from "./Post";
import { useDispatch, useSelector } from "react-redux";
import { addAllposts, selectPost } from "./../public/src/features/postSlice";
import axios from "axios";

const Posts = () => {
  const FACEBOOK_CLONE_ENDPOINT = "http://localhost:8080/api/v1/post";
  const dispatch = useDispatch();
  const posts = useSelector(selectPost);
  useEffect(() => {
    const fetchData = () => {
      const response = axios.get(FACEBOOK_CLONE_ENDPOINT).then((response) => {
        dispatch(addAllposts(response.data));
      });
    };
    fetchData();
  }, []);

  return (
    <div>
      {posts.map((post) => (
        <Post post={post} key={post.id} />
      ))}
    </div>
  );
};

export default Posts;
