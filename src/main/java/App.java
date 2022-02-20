import static spark.Spark.*;
import java.util.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/",( request, response) ->{
            return new ModelAndView( new HashMap(), "hello.hbs");
                },new HandlebarsTemplateEngine() );

        get("/images",(request, response) ->{
            return new ModelAndView( new HashMap(), "images.hbs");
        },new HandlebarsTemplateEngine());
    }
}
