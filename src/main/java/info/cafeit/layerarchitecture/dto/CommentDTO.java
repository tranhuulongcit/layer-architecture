package info.cafeit.layerarchitecture.dto;

import info.cafeit.layerarchitecture.entity.CommentEntity;

import java.util.Date;
import java.util.UUID;

public class CommentDTO {
    private Long postId;
    private String content;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CommentEntity toCommentEntity() {
        CommentEntity cmt = new CommentEntity();
        cmt.setContent(this.content);
        cmt.setPostId(this.postId);
        //trong thực tế thì có thể lấy tên user ở authenticate. ở đây mình chỉ random chuổi bất kỳ
        cmt.setAuthor(UUID.randomUUID().toString());
        cmt.setCreateAt(new Date());
        cmt.setUpdateAt(new Date());
        return cmt;
    }
}
