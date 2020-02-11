package info.cafeit.layerarchitecture.service;

import info.cafeit.layerarchitecture.dto.CommentDTO;
import info.cafeit.layerarchitecture.entity.CommentEntity;

import java.util.List;

public interface CommentService {
    CommentEntity post(CommentDTO commentDTO);

    List<CommentEntity> fetchAll();
}
