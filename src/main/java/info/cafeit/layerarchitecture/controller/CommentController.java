package info.cafeit.layerarchitecture.controller;

import info.cafeit.layerarchitecture.dto.CommentDTO;
import info.cafeit.layerarchitecture.entity.CommentEntity;
import info.cafeit.layerarchitecture.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class CommentController {
    private final CommentService commentService;

    //inject thông qua constructor
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/comment/post")
    public ResponseEntity<CommentEntity> postComment(@RequestBody CommentDTO commentDTO) {
        //đoạn này sẽ validate data trước khi vào xữ lý
        return new ResponseEntity<>(commentService.post(commentDTO), HttpStatus.OK);
    }

    @GetMapping("/comments")
    public ResponseEntity<List<CommentEntity>> fetchComments() {
        return new ResponseEntity<>(commentService.fetchAll(), HttpStatus.OK);
    }

}
