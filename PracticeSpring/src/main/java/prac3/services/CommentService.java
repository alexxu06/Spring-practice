package prac3.services;

import org.springframework.stereotype.Service;
import prac3.annotation.ToLog;
import prac3.model.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

//    @ToLog
//    public void deleteComment(Comment comment) {
//        logger.info("Deleting comment: " + comment.getText());
//    }
//
//    public void editComment(Comment comment) {
//        logger.info("Editing comment: " + comment.getText());
//    }
}
