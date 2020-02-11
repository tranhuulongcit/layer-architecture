package info.cafeit.layerarchitecture.service;

import info.cafeit.layerarchitecture.dto.CommentDTO;
import info.cafeit.layerarchitecture.entity.CommentEntity;
import info.cafeit.layerarchitecture.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentEntity post(CommentDTO commentDTO) {
        //mapper data và lưu vào database
        return commentRepository.saveComment(commentDTO.toCommentEntity());
    }

    @Override
    public List<CommentEntity> fetchAll() {
        return commentRepository.getAll();
    }
}
