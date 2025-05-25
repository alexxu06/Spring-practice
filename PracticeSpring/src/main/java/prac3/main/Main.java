package prac3.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import prac3.config.ProjectConfig;
import prac3.model.Comment;
import prac3.services.CommentService;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Alex");
        comment.setText("This is a random text");

        service.publishComment(comment);
//        service.deleteComment(comment);
//        service.editComment(comment);

//        logger.info(value);

    }
}