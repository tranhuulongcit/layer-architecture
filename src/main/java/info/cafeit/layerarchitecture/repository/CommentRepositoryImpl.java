package info.cafeit.layerarchitecture.repository;

import info.cafeit.layerarchitecture.entity.CommentEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Repository
public class CommentRepositoryImpl implements CommentRepository {

    //mình sẽ giả lập list này như 1 database
    private static List<CommentEntity> DATA_SOURCE = new ArrayList<>();

    @Override
    public CommentEntity saveComment(CommentEntity comment) {
        //generate primary key
        comment.setCommentId(ThreadLocalRandom.current().nextLong(100));
        DATA_SOURCE.add(comment);
        //thay vì truy vấn vào database thì ta sẽ lấy data từ list giả lập
        return DATA_SOURCE.get(DATA_SOURCE.indexOf(comment));
    }

    @Override
    public List<CommentEntity> getAll() {
        //thay vì truy vấn vào database thì ta sẽ lấy data từ list giả lập
        return DATA_SOURCE;
    }
}
