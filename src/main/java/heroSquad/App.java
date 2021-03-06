/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package heroSquad;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);

        get("/",(request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/index.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        /*get("/heroes/new",(request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/heroform.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());*/
        get("/hero-squad",(request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heroes", Hero.getAll());
            model.put("template", "templates/herosquad.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
       /* post("/heroes", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));  //Original hero add route
            String special = request.queryParams("power");
            String strength = request.queryParams("strength");
            String weak = request.queryParams("weak");
            Hero newHero = new Hero(name, age, special, strength,weak);
            model.put("template", "templates/success.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());*/

        //Squad routes
        get("/squad/new",(request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/squadform.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/squad", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String name =request.queryParams("name");
            int size = Integer.parseInt(request.queryParams("size"));
            String cause = request.queryParams("cause");
            Squad newSquad = new Squad(name,size,cause);
            model.put("template", "templates/success.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
        get("/squad",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("squads", Squad.squadAll());
            model.put("template", "templates/squad.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


        get("/squads/:id",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("squad", squad);
            model.put("template", "templates/squadDetails.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
        get("/squad/:id/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("squads", squad);
            model.put("template", "templates/squad-hero-form.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
        post("/hero-squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.params("squadId")));
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String special = request.queryParams("power");
            String strength = request.queryParams("strength");
            String weak = request.queryParams("weak");
            Hero squadHero = new Hero(name, age, special,strength,weak);
            squad.addHero(squadHero);
            model.put("squad", squad);
            model.put("template", "templates/heroSuccess.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    }
}
