package prac2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import prac2.config.ProjectConfig;
import prac2.model.Comment;
import prac2.proxies.CommentNotificationProxy;
import prac2.proxies.EmailNotificationProxy;
import prac2.repositories.CommentRepository;
import prac2.repositories.DBCommentRepository;
import prac2.services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        CommentRepository commentRepository = new DBCommentRepository();
//        CommentNotificationProxy commentNotificationProxy = new EmailNotificationProxy();
//        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
        // above are now included from Spring DI

        Comment comment = new Comment();
        comment.setAuthor("Alex");
        comment.setText("This is a random comment");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publicComment(comment);

    }
}
