package info.cafeit.layerarchitecture.repository;

import info.cafeit.layerarchitecture.entity.CommentEntity;

import java.util.List;

public interface CommentRepository {
    CommentEntity saveComment(CommentEntity comment);

    List<CommentEntity> getAll();
}
